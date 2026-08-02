package ru.ok.android.externcalls.sdk.stat.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.vk.movika.sdk.android.defaultplayer.control.i;
import com.vkontakte.android.R;
import xsna.zcl;

/* compiled from: TextStatRendererView.kt */
/* loaded from: classes9.dex */
public final class TextStatRendererView extends FrameLayout {
    public static final String CLIP_LABEL = "textstat";
    public static final Companion Companion = new Companion(null);
    private View clipAction;
    private CharSequence lastStatText;
    private TextStatRenderer renderer;
    private TextView text;

    /* compiled from: TextStatRendererView.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public TextStatRendererView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(Context context, TextStatRendererView textStatRendererView, View view) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        ClipData newPlainText = ClipData.newPlainText(CLIP_LABEL, textStatRendererView.lastStatText);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(newPlainText);
        }
        Toast.makeText(context, "copied", 0).show();
    }

    public final void onStatText(CharSequence charSequence) {
        this.lastStatText = charSequence;
        this.text.setText(charSequence);
    }

    public final void setRenderer(TextStatRenderer textStatRenderer) {
        TextStatRenderer textStatRenderer2 = this.renderer;
        if (textStatRenderer2 != null) {
            textStatRenderer2.clearConsumer();
        }
        textStatRenderer.setTextConsumer(new TextStatRendererView$setRenderer$1(this));
        this.renderer = textStatRenderer;
    }

    public TextStatRendererView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TextStatRendererView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.text_stat_renderer_view, this);
        this.text = (TextView) findViewById(R.id.tsrv_text);
        View findViewById = findViewById(R.id.tsrv_clip);
        this.clipAction = findViewById;
        findViewById.setOnClickListener(new i(3, context, this));
    }

    public /* synthetic */ TextStatRendererView(Context context, AttributeSet attributeSet, int i, int i2, zcl zclVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
