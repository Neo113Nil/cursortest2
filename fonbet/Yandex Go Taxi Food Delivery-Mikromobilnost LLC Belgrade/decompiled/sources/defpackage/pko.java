package defpackage;

import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.action.handler.custom.CustomActionHandler;
import kotlinx.serialization.json.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class pko implements jg5 {
    public final /* synthetic */ int a;
    public final lg5 b;

    public /* synthetic */ pko(lg5 lg5Var, int i) {
        this.a = i;
        this.b = lg5Var;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        View handle$lambda$0;
        int i = this.a;
        lg5 lg5Var = this.b;
        switch (i) {
            case 0:
                if (ig5Var instanceof oko) {
                    try {
                        c cVar = ((oko) ig5Var).g;
                        if (cVar != null) {
                            new JSONObject(cVar.toString());
                        }
                    } catch (JSONException unused) {
                    }
                    lg5Var.getClass();
                    break;
                }
                break;
            case 1:
                if (ig5Var instanceof oti0) {
                    lg5Var.getClass();
                    break;
                }
                break;
            case 2:
                if (ig5Var instanceof voq0) {
                    voq0 voq0Var = (voq0) ig5Var;
                    lg5Var.b(voq0Var.a, voq0Var.b);
                    break;
                }
                break;
            case 3:
                if (ig5Var instanceof r3r0) {
                    lg5Var.getClass();
                    break;
                }
                break;
            default:
                if (ig5Var instanceof n6s0) {
                    v8e v8eVar = jh5Var.b;
                    n6s0 n6s0Var = (n6s0) ig5Var;
                    handle$lambda$0 = CustomActionHandler.handle$lambda$0((CustomActionHandler) v8eVar.b, n6s0Var.a);
                    if (handle$lambda$0 != null) {
                        handle$lambda$0.getLocationOnScreen(new int[2]);
                        float f = handle$lambda$0.getResources().getDisplayMetrics().density;
                        Drawable background = handle$lambda$0.getBackground();
                        if (background instanceof GradientDrawable) {
                            ((GradientDrawable) background).getCornerRadius();
                        } else {
                            Outline outline = new Outline();
                            ViewOutlineProvider outlineProvider = handle$lambda$0.getOutlineProvider();
                            if (outlineProvider != null) {
                                try {
                                    outlineProvider.getOutline(handle$lambda$0, outline);
                                    float radius = outline.getRadius();
                                    if (Math.abs(radius) <= Float.MAX_VALUE) {
                                        int i2 = (radius > 0.0f ? 1 : (radius == 0.0f ? 0 : -1));
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        handle$lambda$0.getHeight();
                        String str = n6s0Var.d;
                        if (str != null) {
                            try {
                                Color.parseColor(str);
                            } catch (IllegalArgumentException unused3) {
                            }
                        }
                        handle$lambda$0.getWidth();
                        lg5Var.getClass();
                        break;
                    }
                }
                break;
        }
    }
}
