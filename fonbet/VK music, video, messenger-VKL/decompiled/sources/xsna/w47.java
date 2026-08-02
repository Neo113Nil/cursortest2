package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.vkontakte.android.R;
import xsna.e57;
import xsna.ghr;

/* compiled from: BiometricFragment.java */
/* loaded from: classes11.dex */
public final class w47 implements fr70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Fragment c;

    public /* synthetic */ w47(Fragment fragment, int i) {
        this.b = i;
        this.c = fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // xsna.fr70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                q47 q47Var = (q47) this.c;
                if (((Boolean) obj).booleanValue()) {
                    if (q47Var.vn()) {
                        q47Var.xn();
                    } else {
                        o57 o57Var = q47Var.i;
                        CharSequence charSequence = o57Var.i;
                        if (charSequence == null) {
                            e57.d dVar = o57Var.d;
                            if (dVar != null) {
                                charSequence = dVar.d;
                                if (charSequence == null) {
                                    charSequence = "";
                                }
                            } else {
                                charSequence = null;
                            }
                        }
                        if (charSequence == null) {
                            charSequence = q47Var.getString(R.string.default_error_msg);
                        }
                        q47Var.yn(13, charSequence);
                        q47Var.tn(2);
                    }
                    q47Var.i.m(false);
                    break;
                }
                break;
            default:
                Integer num = (Integer) obj;
                ghr ghrVar = (ghr) this.c;
                Handler handler = ghrVar.x;
                ghr.a aVar = ghrVar.y;
                handler.removeCallbacks(aVar);
                int intValue = num.intValue();
                if (ghrVar.C != null) {
                    int i = ghrVar.z.w;
                    Context mo2getContext = ghrVar.mo2getContext();
                    Drawable drawable = null;
                    if (mo2getContext != null) {
                        int i2 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i != 0 || intValue != 1) {
                            if (i != 1 || intValue != 2) {
                                if (i == 2) {
                                }
                                if (i == 1) {
                                    break;
                                }
                            } else {
                                i2 = R.drawable.fingerprint_dialog_error;
                            }
                        }
                        drawable = mo2getContext.getDrawable(i2);
                    }
                    if (drawable != null) {
                        ghrVar.C.setImageDrawable(drawable);
                        if ((i != 0 || intValue != 1) && ((i == 1 && intValue == 2) || (i == 2 && intValue == 1))) {
                            ghr.c.a(drawable);
                        }
                        ghrVar.z.w = intValue;
                    }
                }
                int intValue2 = num.intValue();
                TextView textView = ghrVar.D;
                if (textView != null) {
                    textView.setTextColor(intValue2 == 2 ? ghrVar.A : ghrVar.B);
                }
                handler.postDelayed(aVar, 2000L);
                break;
        }
    }
}
