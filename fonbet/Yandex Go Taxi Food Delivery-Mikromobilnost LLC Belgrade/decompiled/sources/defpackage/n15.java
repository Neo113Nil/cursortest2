package defpackage;

import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.text.TextUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.entities.MessageData;
import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteResultEntity;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.a;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class n15 implements d4x {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;
    public final Object w;

    public n15(String str, Rect rect, List list, String str2, Matrix matrix) {
        this.a = 6;
        this.b = str;
        Rect rect2 = new Rect(rect);
        if (matrix != null) {
            qnc.d(rect2, matrix);
        }
        this.c = rect2;
        Point[] pointArr = new Point[list.size()];
        for (int i = 0; i < list.size(); i++) {
            pointArr[i] = new Point((Point) list.get(i));
        }
        if (matrix != null) {
            qnc.b(pointArr, matrix);
        }
        this.w = str2;
    }

    public static String a(String str, String str2) {
        return g8e.p(str, "/", str2);
    }

    public void b() {
        p66 p66Var = (p66) this.b;
        if (p66Var != null) {
            ((Handler) this.w).removeCallbacks(p66Var);
            this.b = null;
        }
    }

    public void c() {
        Handler handler = (Handler) this.w;
        p66 p66Var = (p66) this.b;
        if (p66Var != null) {
            handler.removeCallbacks(p66Var);
        }
        p66 p66Var2 = new p66(this);
        this.b = p66Var2;
        handler.post(p66Var2);
    }

    public String d(Object obj) {
        if (obj != null) {
            return ((JsonAdapter) ((i3y) this.w).getValue()).toJson(obj);
        }
        return null;
    }

    public String e() {
        if (TextUtils.isEmpty((String) this.b)) {
            z83.j("block id not initialized, call setBlockId first");
        }
        return (String) this.b;
    }

    public abstract String f(MessageData messageData);

    public abstract TransferRequisiteResultEntity g();

    public hdu h(MessageData messageData) {
        String f;
        noy0 noy0Var = (noy0) this.c;
        String str = messageData.notificationText;
        if (str == null || str.length() == 0) {
            String str2 = messageData.text;
            if (str2 == null || str2.length() == 0) {
                f = f(messageData);
            } else {
                f = ((v3k0) noy0Var).b(0, messageData.text).toString();
            }
        } else {
            f = ((v3k0) noy0Var).b(0, messageData.notificationText).toString();
        }
        return ((ij10) this.w).a(f);
    }

    public abstract boolean i(vqj0 vqj0Var);

    public abstract void j();

    public abstract void k();

    public Object l(String str) {
        if (str != null) {
            return ((JsonAdapter) ((i3y) this.w).getValue()).fromJson(str);
        }
        return null;
    }

    public String m() {
        String str = (String) this.b;
        return str == null ? "" : str;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                tjz0 tjz0Var = new tjz0();
                String obj = super.toString();
                StringBuilder sb = tjz0Var.a;
                sb.append(obj);
                tjz0Var.a((x3k) this.c, "action");
                tjz0Var.a((rbh) this.w, "paddingModifier");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n15(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    public n15(zuj0 zuj0Var) {
        this.a = 1;
        this.b = zuj0Var;
        this.c = new bdc(xng0.textMain);
        this.w = new bdc(xng0.textMinor);
    }

    public n15(ogz ogzVar, Handler handler, p2x0 p2x0Var) {
        this.a = 2;
        this.c = ogzVar;
        this.w = handler;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|2|3|(7:5|6|7|8|(2:10|11)|13|14)|19|6|7|8|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r5.e(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: JSONException -> 0x002f, TRY_LEAVE, TryCatch #1 {JSONException -> 0x002f, blocks: (B:8:0x0020, B:10:0x0028), top: B:7:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n15(JSONObject jSONObject, quz quzVar) {
        x3k x3kVar;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        this.a = 4;
        this.b = "";
        rbh rbhVar = null;
        try {
            optJSONObject2 = jSONObject.optJSONObject("action");
        } catch (JSONException e) {
            quzVar.e(e);
        }
        if (optJSONObject2 != null) {
            x3kVar = new x3k(optJSONObject2, quzVar);
            this.c = x3kVar;
            optJSONObject = jSONObject.optJSONObject("padding_modifier");
            if (optJSONObject != null) {
                rbhVar = new rbh(optJSONObject, quzVar);
            }
            this.w = rbhVar;
        }
        x3kVar = null;
        this.c = x3kVar;
        optJSONObject = jSONObject.optJSONObject("padding_modifier");
        if (optJSONObject != null) {
        }
        this.w = rbhVar;
    }

    public n15(Moshi moshi, Type type) {
        this.a = 5;
        this.b = moshi;
        this.c = type;
        this.w = a.a(new m020(15, this));
    }
}
