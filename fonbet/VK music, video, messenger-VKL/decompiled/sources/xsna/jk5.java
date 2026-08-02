package xsna;

import android.content.Context;
import com.vk.stickers.autosuggest.AutoSuggestStickersPopupWindow;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ls50;

/* compiled from: AutoSuggestStickersPopupWindow.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class jk5 extends FunctionReferenceImpl implements wzs {
    public final /* synthetic */ int b = 1;

    public /* synthetic */ jk5(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        wp50 wp50Var;
        wp50 wp50Var2;
        switch (this.b) {
            case 0:
                ((AutoSuggestStickersPopupWindow) this.receiver).y(((Number) obj).intValue(), (Context) obj2);
                break;
            default:
                ls50 ls50Var = (ls50) obj;
                ls50 ls50Var2 = (ls50) obj2;
                js50 js50Var = (js50) this.receiver;
                js50Var.getClass();
                if ((ls50Var2 instanceof ls50.a) && (wp50Var2 = ((ls50.a) ls50Var2).b) != null) {
                    js50Var.b.f(wp50Var2);
                } else if ((ls50Var2 instanceof ls50.b) && (ls50Var instanceof ls50.a) && (wp50Var = ((ls50.a) ls50Var).b) != null) {
                    wp50Var.g();
                }
                break;
        }
        return s3q0.a;
    }

    public jk5(Object obj) {
        super(2, obj, AutoSuggestStickersPopupWindow.class, "onInactivePackClicked", "onInactivePackClicked(ILandroid/content/Context;)V", 0);
    }
}
