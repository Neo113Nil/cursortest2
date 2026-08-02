package xsna;

import android.graphics.ColorSpace;
import com.vk.video.polls.entrypoint.model.UxPollEntryPointLocation;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* compiled from: CallParticipantNameChecker.kt */
/* loaded from: classes7.dex */
public final class j79 implements sjg {
    public final Object b;
    public final Object c;

    public j79(qez0 qez0Var, Object obj) {
        this.b = qez0Var;
        this.c = obj;
    }

    @Override // xsna.sjg
    public void a(io.reactivex.rxjava3.disposables.c cVar) {
        io.reactivex.rxjava3.disposables.b bVar = ((jtq0) this.c).i;
        if (bVar == null) {
            bVar = null;
        }
        bVar.b(cVar);
    }

    public io.reactivex.rxjava3.internal.operators.single.d0 b(String str) {
        dz2 x = yfb.x(((qd9) ((bpn0) this.b).getValue()).g(str));
        if (!o25.a().b()) {
            x.d = true;
            x.c = true;
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(rsg0.y0(x, null, null, 3).U(new ed(new sd4(3), 5)).K(), new i79(this, str), null);
    }

    @Override // xsna.sjg
    public String getRef() {
        return (String) this.b;
    }

    public j79() {
        this.b = new bpn0(new uw3(5));
        this.c = new bpn0(new l9(4));
    }

    public j79(int i, int i2, ColorSpace colorSpace) {
        this.b = colorSpace;
        this.c = (i == -1 || i2 == -1) ? null : new Pair(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public j79(vh8 vh8Var) {
        this.b = vh8Var;
        zrp<UxPollEntryPointLocation> i = UxPollEntryPointLocation.i();
        int e = on00.e(c5g.u(i, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        for (Object obj : i) {
            linkedHashMap.put(obj, null);
        }
        this.c = io.reactivex.rxjava3.subjects.d.O0(new EnumMap(linkedHashMap));
    }

    public j79(jtq0 jtq0Var) {
        this.c = jtq0Var;
        this.b = jtq0Var.c.c;
    }
}
