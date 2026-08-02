package defpackage;

import androidx.room.RoomDatabase;
import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.a;

/* loaded from: classes.dex */
public abstract class hjv {
    public final Object a;
    public final Object b;
    public final Object c;

    public hjv(Class cls, g2f0... g2f0VarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (g2f0 g2f0Var : g2f0VarArr) {
            boolean containsKey = hashMap.containsKey(g2f0Var.a);
            Class cls2 = g2f0Var.a;
            if (containsKey) {
                vg10.g(cls2.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                throw null;
            }
            hashMap.put(cls2, g2f0Var);
        }
        if (g2f0VarArr.length > 0) {
            this.c = g2f0VarArr[0].a;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    public zfs a() {
        RoomDatabase roomDatabase = (RoomDatabase) this.a;
        roomDatabase.t0();
        if (((AtomicBoolean) this.b).compareAndSet(false, true)) {
            return (zfs) ((i3y) this.c).getValue();
        }
        String c = c();
        roomDatabase.t0();
        roomDatabase.u0();
        return roomDatabase.D0().getWritableDatabase().g(c);
    }

    public void b(boolean z) {
        if (((AtomicBoolean) this.b).compareAndSet(true, false)) {
            ((njv) this.c).k((String) this.a, "Close", new Pair(ic90.a("close_button_clicked"), Boolean.valueOf(z)));
        }
    }

    public abstract String c();

    public void d(String str, boolean z) {
        if (z) {
            ((AtomicBoolean) this.b).set(false);
        }
        ((njv) this.c).k((String) this.a, str, new Pair[0]);
    }

    public TinkFipsUtil$AlgorithmFipsCompatibility e() {
        return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    }

    public abstract String f();

    public Object g(vt10 vt10Var, Class cls) {
        g2f0 g2f0Var = (g2f0) ((Map) this.b).get(cls);
        if (g2f0Var != null) {
            return g2f0Var.a(vt10Var);
        }
        vg10.i("Requested primitive class ", cls.getCanonicalName(), " not supported.");
        return null;
    }

    public abstract w3 h();

    public abstract KeyData$KeyMaterialType i();

    public abstract vt10 j(ByteString byteString);

    public void k(zfs zfsVar) {
        if (zfsVar == ((zfs) ((i3y) this.c).getValue())) {
            ((AtomicBoolean) this.b).set(false);
        }
    }

    public abstract void l(vt10 vt10Var);

    public hjv(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        this.b = new AtomicBoolean(false);
        this.c = a.a(new qhq0(7, this));
    }

    public hjv(njv njvVar, String str) {
        this.c = njvVar;
        this.a = str;
        this.b = new AtomicBoolean();
    }
}
