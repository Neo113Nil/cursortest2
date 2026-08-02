package androidx.emoji2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.inputmethodservice.InputMethodService;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.LinearLayout;
import androidx.core.view.b;
import defpackage.m4i0;
import defpackage.q7h0;
import defpackage.rth0;
import defpackage.sp31;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class EmojiExtractTextLayout extends LinearLayout {
    private View.OnClickListener mButtonOnClickListener;
    private ViewGroup mExtractAccessories;
    private ExtractButtonCompat mExtractAction;
    private EmojiExtractEditText mExtractEditText;
    private boolean mInitialized;

    public static final class ButtonOnclickListener implements View.OnClickListener {
        private final InputMethodService mInputMethodService;

        public ButtonOnclickListener(InputMethodService inputMethodService) {
            this.mInputMethodService = inputMethodService;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            EditorInfo currentInputEditorInfo = this.mInputMethodService.getCurrentInputEditorInfo();
            InputConnection currentInputConnection = this.mInputMethodService.getCurrentInputConnection();
            if (currentInputEditorInfo == null || currentInputConnection == null) {
                return;
            }
            int i = currentInputEditorInfo.actionId;
            if (i != 0) {
                currentInputConnection.performEditorAction(i);
                return;
            }
            int i2 = currentInputEditorInfo.imeOptions;
            if ((i2 & 255) != 1) {
                currentInputConnection.performEditorAction(i2 & 255);
            }
        }
    }

    public EmojiExtractTextLayout(Context context) {
        super(context);
        init(context, null, 0, 0);
    }

    private View.OnClickListener getButtonClickListener(InputMethodService inputMethodService) {
        if (this.mButtonOnClickListener == null) {
            this.mButtonOnClickListener = new ButtonOnclickListener(inputMethodService);
        }
        return this.mButtonOnClickListener;
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        setOrientation(0);
        View inflate = LayoutInflater.from(context).inflate(rth0.input_method_extract_view, (ViewGroup) this, true);
        this.mExtractAccessories = (ViewGroup) inflate.findViewById(q7h0.inputExtractAccessories);
        this.mExtractAction = (ExtractButtonCompat) inflate.findViewById(q7h0.inputExtractAction);
        this.mExtractEditText = (EmojiExtractEditText) inflate.findViewById(R.id.inputExtractEditText);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m4i0.EmojiExtractTextLayout, i, i2);
            int[] iArr = m4i0.EmojiExtractTextLayout;
            WeakHashMap weakHashMap = b.a;
            sp31.b(this, context, iArr, attributeSet, obtainStyledAttributes, i, i2);
            this.mExtractEditText.setEmojiReplaceStrategy(obtainStyledAttributes.getInteger(m4i0.EmojiExtractTextLayout_emojiReplaceStrategy, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public int getEmojiReplaceStrategy() {
        return this.mExtractEditText.getEmojiReplaceStrategy();
    }

    public void onUpdateExtractingViews(InputMethodService inputMethodService, EditorInfo editorInfo) {
        ViewGroup viewGroup;
        if (inputMethodService.isExtractViewShown() && (viewGroup = this.mExtractAccessories) != null) {
            if (editorInfo.actionLabel == null) {
                int i = editorInfo.imeOptions;
                if ((i & 255) == 1 || (i & 536870912) != 0 || editorInfo.inputType == 0) {
                    viewGroup.setVisibility(8);
                    ExtractButtonCompat extractButtonCompat = this.mExtractAction;
                    if (extractButtonCompat != null) {
                        extractButtonCompat.setOnClickListener(null);
                        return;
                    }
                    return;
                }
            }
            viewGroup.setVisibility(0);
            ExtractButtonCompat extractButtonCompat2 = this.mExtractAction;
            if (extractButtonCompat2 != null) {
                CharSequence charSequence = editorInfo.actionLabel;
                if (charSequence != null) {
                    extractButtonCompat2.setText(charSequence);
                } else {
                    extractButtonCompat2.setText(inputMethodService.getTextForImeAction(editorInfo.imeOptions));
                }
                this.mExtractAction.setOnClickListener(getButtonClickListener(inputMethodService));
            }
        }
    }

    public void setEmojiReplaceStrategy(int i) {
        this.mExtractEditText.setEmojiReplaceStrategy(i);
    }

    public EmojiExtractTextLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    public EmojiExtractTextLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }
}
