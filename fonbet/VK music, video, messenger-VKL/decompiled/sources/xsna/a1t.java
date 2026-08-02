package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.EditText;
import android.widget.TextView;
import com.ironsource.adapters.fyber.FyberAdapter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class a1t implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a1t(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (xsna.c49.a.matcher(r0).matches() != false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                FyberAdapter.init$lambda$2((FyberAdapter) obj3, (Context) obj2, (String) obj);
                break;
            default:
                TextView textView = (TextView) obj;
                String obj4 = drm0.p0(((EditText) obj3).getText().toString()).toString();
                String obj5 = drm0.p0(((EditText) obj2).getText().toString()).toString();
                boolean z2 = true;
                if (!o25.a().b()) {
                    SharedPreferences sharedPreferences = i0y.a;
                    if (obj5.length() <= 0) {
                        z = false;
                        if (textView == null) {
                            if (z) {
                                i0y.b.getClass();
                                break;
                            }
                            z2 = false;
                            textView.setEnabled(z2);
                            break;
                        }
                    }
                }
                z = true;
                if (textView == null) {
                }
                break;
        }
    }
}
