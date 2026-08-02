package defpackage;

import com.yandex.div2.JsonParserComponent;
import com.yandex.div2.c1;
import com.yandex.div2.p0;
import com.yandex.div2.s0;
import com.yandex.div2.u;
import com.yandex.div2.x;
import com.yandex.div2.z0;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes.dex */
public final class fxk implements zsq0, nyi {
    public final JsonParserComponent a;

    public fxk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // defpackage.nyi
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xel a(yf90 yf90Var, JSONObject jSONObject) {
        String str;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        xel xelVar = hexVar instanceof xel ? (xel) hexVar : null;
        if (xelVar == null) {
            str = R;
        } else if (xelVar instanceof lel) {
            str = "image";
        } else if (xelVar instanceof jel) {
            str = "gif";
        } else if (xelVar instanceof vel) {
            str = "text";
        } else if (xelVar instanceof qel) {
            str = "separator";
        } else if (xelVar instanceof gel) {
            str = "container";
        } else if (xelVar instanceof kel) {
            str = "grid";
        } else if (xelVar instanceof iel) {
            str = "gallery";
        } else if (xelVar instanceof oel) {
            str = "pager";
        } else if (xelVar instanceof uel) {
            str = "tabs";
        } else if (xelVar instanceof sel) {
            str = ClidProvider.STATE;
        } else if (xelVar instanceof hel) {
            str = "custom";
        } else if (xelVar instanceof mel) {
            str = "indicator";
        } else if (xelVar instanceof rel) {
            str = "slider";
        } else if (xelVar instanceof tel) {
            str = "switch";
        } else if (xelVar instanceof nel) {
            str = "input";
        } else if (xelVar instanceof pel) {
            str = "select";
        } else {
            if (!(xelVar instanceof wel)) {
                w511.b();
                return null;
            }
            str = MediaStreamTrack.VIDEO_TRACK_KIND;
        }
        int hashCode = str.hashCode();
        xel xelVar2 = xelVar;
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1349088399:
                if (str.equals("custom")) {
                    return new hel(((vlk) jsonParserComponent.L2.getValue()).c(yf90Var, (emk) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case -906021636:
                if (str.equals("select")) {
                    return new pel(((a8l) jsonParserComponent.R6.getValue()).c(yf90Var, (f8l) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case -899647263:
                if (str.equals("slider")) {
                    return new rel(((nal) jsonParserComponent.v7.getValue()).c(yf90Var, (tal) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case -889473228:
                if (str.equals("switch")) {
                    return new tel(((adl) jsonParserComponent.c8.getValue()).c(yf90Var, (cdl) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    return new mel(((z0) jsonParserComponent.p4.getValue()).c(yf90Var, (c1) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case -410956671:
                if (str.equals("container")) {
                    return new gel(((u) jsonParserComponent.w2.getValue()).c(yf90Var, (x) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case -196315310:
                if (str.equals("gallery")) {
                    return new iel(((p0) jsonParserComponent.X3.getValue()).c(yf90Var, (s0) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 102340:
                if (str.equals("gif")) {
                    return new jel(((bsk) jsonParserComponent.a4.getValue()).c(yf90Var, (dsk) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 3181382:
                if (str.equals("grid")) {
                    return new kel(((jsk) jsonParserComponent.d4.getValue()).c(yf90Var, (lsk) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 3552126:
                if (str.equals("tabs")) {
                    return new uel(((ydl) jsonParserComponent.f8.getValue()).c(yf90Var, (fel) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 3556653:
                if (str.equals("text")) {
                    return new vel(((wfl) jsonParserComponent.L8.getValue()).c(yf90Var, (uhl) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 100313435:
                if (str.equals("image")) {
                    return new lel(((etk) jsonParserComponent.j4.getValue()).c(yf90Var, (ttk) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 100358090:
                if (str.equals("input")) {
                    return new nel(((kvk) jsonParserComponent.S4.getValue()).c(yf90Var, (bwk) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 106426307:
                if (str.equals("pager")) {
                    return new oel(((y1l) jsonParserComponent.L5.getValue()).c(yf90Var, (r2l) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 109757585:
                if (str.equals(ClidProvider.STATE)) {
                    return new sel(((gbl) jsonParserComponent.H7.getValue()).c(yf90Var, (nbl) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 112202875:
                if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    return new wel(((dol) jsonParserComponent.P9.getValue()).c(yf90Var, (qol) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
            case 1732829925:
                if (str.equals("separator")) {
                    return new qel(((j8l) jsonParserComponent.X6.getValue()).c(yf90Var, (k8l) (xelVar2 != null ? xelVar2.a() : null), jSONObject));
                }
                break;
        }
        throw fg90.m(jSONObject, "type", str);
    }

    @Override // defpackage.zsq0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, xel xelVar) {
        boolean z = xelVar instanceof lel;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((etk) jsonParserComponent.j4.getValue()).b(yf90Var, ((lel) xelVar).a);
        }
        if (xelVar instanceof jel) {
            return ((bsk) jsonParserComponent.a4.getValue()).b(yf90Var, ((jel) xelVar).a);
        }
        if (xelVar instanceof vel) {
            return ((wfl) jsonParserComponent.L8.getValue()).b(yf90Var, ((vel) xelVar).a);
        }
        if (xelVar instanceof qel) {
            return ((j8l) jsonParserComponent.X6.getValue()).b(yf90Var, ((qel) xelVar).a);
        }
        if (xelVar instanceof gel) {
            return ((u) jsonParserComponent.w2.getValue()).b(yf90Var, ((gel) xelVar).a);
        }
        if (xelVar instanceof kel) {
            return ((jsk) jsonParserComponent.d4.getValue()).b(yf90Var, ((kel) xelVar).a);
        }
        if (xelVar instanceof iel) {
            return ((p0) jsonParserComponent.X3.getValue()).b(yf90Var, ((iel) xelVar).a);
        }
        if (xelVar instanceof oel) {
            return ((y1l) jsonParserComponent.L5.getValue()).b(yf90Var, ((oel) xelVar).a);
        }
        if (xelVar instanceof uel) {
            return ((ydl) jsonParserComponent.f8.getValue()).b(yf90Var, ((uel) xelVar).a);
        }
        if (xelVar instanceof sel) {
            return ((gbl) jsonParserComponent.H7.getValue()).b(yf90Var, ((sel) xelVar).a);
        }
        if (xelVar instanceof hel) {
            return ((vlk) jsonParserComponent.L2.getValue()).b(yf90Var, ((hel) xelVar).a);
        }
        if (xelVar instanceof mel) {
            return ((z0) jsonParserComponent.p4.getValue()).b(yf90Var, ((mel) xelVar).a);
        }
        if (xelVar instanceof rel) {
            return ((nal) jsonParserComponent.v7.getValue()).b(yf90Var, ((rel) xelVar).a);
        }
        if (xelVar instanceof tel) {
            return ((adl) jsonParserComponent.c8.getValue()).b(yf90Var, ((tel) xelVar).a);
        }
        if (xelVar instanceof nel) {
            return ((kvk) jsonParserComponent.S4.getValue()).b(yf90Var, ((nel) xelVar).a);
        }
        if (xelVar instanceof pel) {
            return ((a8l) jsonParserComponent.R6.getValue()).b(yf90Var, ((pel) xelVar).a);
        }
        if (xelVar instanceof wel) {
            return ((dol) jsonParserComponent.P9.getValue()).b(yf90Var, ((wel) xelVar).a);
        }
        w511.b();
        return null;
    }
}
