package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class tw3 implements tx3 {
    public static final tw3 f = new tw3(new vx3());
    public final fy3 a = new fy3();
    public Date b;
    public boolean c;
    public final vx3 d;
    public boolean e;

    public tw3(vx3 vx3Var) {
        this.d = vx3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.tx3
    public final void a(boolean z) {
        if (!this.e && z) {
            this.a.getClass();
            Date date = new Date();
            Date date2 = this.b;
            if (date2 == null || date.after(date2)) {
                this.b = date;
                if (this.c) {
                    Iterator it = Collections.unmodifiableCollection(rx3.c.b).iterator();
                    while (it.hasNext()) {
                        ka kaVar = ((ax3) it.next()).e;
                        Date date3 = this.b;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        kaVar.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            px3.a(jSONObject, "timestamp", Long.valueOf(date4.getTime()));
                            my3.a.a((WebView) kaVar.b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.e = z;
    }
}
