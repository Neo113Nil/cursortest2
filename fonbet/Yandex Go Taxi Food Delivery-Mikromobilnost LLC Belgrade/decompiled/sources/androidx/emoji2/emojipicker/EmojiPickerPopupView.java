package androidx.emoji2.emojipicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.aun;
import defpackage.bun;
import defpackage.dun;
import defpackage.eun;
import defpackage.f7h0;
import defpackage.fun;
import defpackage.gth0;
import defpackage.tun;
import defpackage.w511;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001&B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Landroidx/emoji2/emojipicker/EmojiPickerPopupView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "Landroid/view/View;", "targetEmojiView", "Ltun;", "targetEmojiItem", "Landroid/view/View$OnClickListener;", "emojiViewOnClickListener", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/view/View;Ltun;Landroid/view/View$OnClickListener;)V", "Landroidx/emoji2/emojipicker/EmojiPickerPopupView$Companion$Layout;", "getLayout", "()Landroidx/emoji2/emojipicker/EmojiPickerPopupView$Companion$Layout;", "getPopupViewWidth", "()I", "getPopupViewHeight", "Landroid/view/View;", "Ltun;", "Landroid/view/View$OnClickListener;", "", "", "variants", "Ljava/util/List;", "targetEmoji", "Ljava/lang/String;", "Landroid/widget/LinearLayout;", "popupView", "Landroid/widget/LinearLayout;", "Lbun;", "popupDesign", "Lbun;", "Companion", "fun", "emoji2-emojipicker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EmojiPickerPopupView extends FrameLayout {
    private static final int BIDIRECTIONAL_VARIANTS_COUNT = 36;
    public static final fun Companion = new fun();
    private static final Set<String> SQUARE_LAYOUT_EMOJI_NO_SKIN_TONE = Collections.singleton("👪");
    private static final int SQUARE_LAYOUT_VARIANT_COUNT = 26;
    private final View.OnClickListener emojiViewOnClickListener;
    private final bun popupDesign;
    private final LinearLayout popupView;
    private final String targetEmoji;
    private final tun targetEmojiItem;
    private final View targetEmojiView;
    private final List<String> variants;

    public EmojiPickerPopupView(Context context, AttributeSet attributeSet, int i, View view, tun tunVar, View.OnClickListener onClickListener) {
        super(context, attributeSet, i);
        bun eunVar;
        bun bunVar;
        this.targetEmojiView = view;
        this.targetEmojiItem = tunVar;
        this.emojiViewOnClickListener = onClickListener;
        List<String> list = tunVar.b;
        this.variants = list;
        String str = tunVar.a;
        this.targetEmoji = str;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, gth0.variant_popup, null).findViewById(f7h0.variant_popup);
        this.popupView = linearLayout;
        int i2 = b.a[getLayout().ordinal()];
        if (i2 == 1) {
            eunVar = new eun(context, view, list, linearLayout, onClickListener, 1);
        } else if (i2 == 2) {
            eunVar = new eun(context, view, list, linearLayout, onClickListener, 0);
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    w511.b();
                    throw null;
                }
                bunVar = new aun(context, view, list, linearLayout, onClickListener);
                this.popupDesign = bunVar;
                bunVar.b();
                bunVar.c();
                bunVar.a();
                addView(linearLayout);
            }
            eunVar = new dun(context, view, list, linearLayout, onClickListener, str);
        }
        bunVar = eunVar;
        this.popupDesign = bunVar;
        bunVar.b();
        bunVar.c();
        bunVar.a();
        addView(linearLayout);
    }

    private final EmojiPickerPopupView$Companion$Layout getLayout() {
        int size = this.variants.size();
        List<String> list = this.variants;
        return size == 26 ? SQUARE_LAYOUT_EMOJI_NO_SKIN_TONE.contains(list.get(0)) ? EmojiPickerPopupView$Companion$Layout.SQUARE : EmojiPickerPopupView$Companion$Layout.SQUARE_WITH_SKIN_TONE_CIRCLE : list.size() == 36 ? EmojiPickerPopupView$Companion$Layout.BIDIRECTIONAL : EmojiPickerPopupView$Companion$Layout.FLAT;
    }

    public final int getPopupViewHeight() {
        return this.popupView.getPaddingBottom() + this.popupView.getPaddingTop() + (this.targetEmojiView.getHeight() * this.popupDesign.g());
    }

    public final int getPopupViewWidth() {
        return this.popupView.getPaddingEnd() + this.popupView.getPaddingStart() + (this.targetEmojiView.getWidth() * this.popupDesign.f());
    }

    public /* synthetic */ EmojiPickerPopupView(Context context, AttributeSet attributeSet, int i, View view, tun tunVar, View.OnClickListener onClickListener, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i, view, tunVar, onClickListener);
    }

    public EmojiPickerPopupView(Context context, AttributeSet attributeSet, View view, tun tunVar, View.OnClickListener onClickListener) {
        this(context, attributeSet, 0, view, tunVar, onClickListener, 4, null);
    }
}
