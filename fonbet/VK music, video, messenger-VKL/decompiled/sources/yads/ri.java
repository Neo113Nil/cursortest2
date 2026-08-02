package yads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.monetization.ads.nativeads.CustomizableMediaView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class ri {
    public final z22 a;
    public final qi b;
    public final n82 c;

    public ri(z22 z22Var, qi qiVar, n82 n82Var) {
        this.a = z22Var;
        this.b = qiVar;
        this.c = n82Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0198, code lost:
    
        if (r7.equals("string") == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a6, code lost:
    
        if ((r3 instanceof android.widget.TextView) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a8, code lost:
    
        r4 = (android.widget.TextView) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ad, code lost:
    
        if (r4 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01af, code lost:
    
        r4 = new yads.lb0(new yads.f73((android.widget.TextView) r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a1, code lost:
    
        if (r7.equals("number") == false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final HashMap a() {
        Object obj;
        HashMap hashMap = new HashMap();
        qi qiVar = this.b;
        View a = this.a.a("close_button");
        TextView textView = a instanceof TextView ? (TextView) a : null;
        qiVar.getClass();
        iw iwVar = textView != null ? new iw(textView) : null;
        hashMap.put("close_button", iwVar != null ? new lb0(iwVar) : null);
        qi qiVar2 = this.b;
        View a2 = this.a.a("feedback");
        ImageView imageView = a2 instanceof ImageView ? (ImageView) a2 : null;
        qiVar2.getClass();
        uu0 uu0Var = imageView != null ? new uu0(imageView, new y31(imageView.getContext(), new t42(qiVar2.a), qiVar2.b)) : null;
        hashMap.put("feedback", uu0Var != null ? new j31(uu0Var) : null);
        qi qiVar3 = this.b;
        mn2 mn2Var = this.a.b;
        qcy[] qcyVarArr = z22.g;
        qcy qcyVar = qcyVarArr[1];
        ImageView imageView2 = (ImageView) mn2Var.a.get();
        View a3 = this.a.a(X3.i.I0);
        hashMap.put(X3.i.I0, qiVar3.a(imageView2, a3 instanceof CustomizableMediaView ? (CustomizableMediaView) a3 : null));
        qi qiVar4 = this.b;
        View a4 = this.a.a(CampaignEx.JSON_KEY_STAR);
        qiVar4.getClass();
        sm2 sm2Var = a4 instanceof um2 ? new sm2(a4, qiVar4.f) : null;
        hashMap.put(CampaignEx.JSON_KEY_STAR, sm2Var != null ? new lb0(sm2Var) : null);
        qi qiVar5 = this.b;
        View a5 = this.a.a();
        qiVar5.getClass();
        ys2 ys2Var = a5 != null ? new ys2(a5) : null;
        hashMap.put("root_container", ys2Var != null ? new lb0(ys2Var) : null);
        mn2 mn2Var2 = this.a.e;
        qcy qcyVar2 = qcyVarArr[4];
        List list = (List) mn2Var2.a.get();
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
        for (oi oiVar : this.c.a) {
            View a6 = this.a.a(oiVar.a);
            if (a6 != null && !hashMap.containsKey(oiVar.a)) {
                qi qiVar6 = this.b;
                String str = oiVar.b;
                qiVar6.getClass();
                switch (str.hashCode()) {
                    case -1034364087:
                        break;
                    case -891985903:
                        break;
                    case -410956671:
                        if (str.equals("container")) {
                            obj = new lb0(new ys2(a6));
                            break;
                        }
                        obj = null;
                        break;
                    case 100313435:
                        if (str.equals("image")) {
                            if ((a6 instanceof ImageView ? (ImageView) a6 : null) != null) {
                                obj = new j31(new f51((ImageView) a6, qiVar6.b, qiVar6.a));
                                break;
                            }
                        }
                        obj = null;
                        break;
                    case 103772132:
                        if (str.equals(X3.i.I0)) {
                            if ((a6 instanceof CustomizableMediaView ? (CustomizableMediaView) a6 : null) != null) {
                                obj = qiVar6.a(null, (CustomizableMediaView) a6);
                                break;
                            }
                        }
                        obj = null;
                        break;
                    default:
                        obj = null;
                        break;
                }
                if (obj == null) {
                    this.b.getClass();
                    obj = new lb0(new of0(a6));
                }
                hashMap.put(oiVar.a, obj);
            }
        }
        for (Map.Entry entry : this.a.f.entrySet()) {
            String str2 = (String) entry.getKey();
            View view = (View) ((WeakReference) entry.getValue()).get();
            if (view != null && !hashMap.containsKey(str2)) {
                this.b.getClass();
                hashMap.put(str2, new lb0(new of0(view)));
            }
        }
        return hashMap;
    }

    public ri(z22 z22Var, nj2 nj2Var, uo1 uo1Var, e52 e52Var, i42 i42Var, v9 v9Var, n82 n82Var, bu1 bu1Var, t20 t20Var) {
        this(z22Var, new qi(v9Var, nj2Var, uo1Var, e52Var, i42Var, bu1Var, t20Var), n82Var);
    }
}
