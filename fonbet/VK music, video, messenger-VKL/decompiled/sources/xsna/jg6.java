package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.vk.log.L;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import okhttp3.l;
import okhttp3.p;
import ru.ok.android.sdk.SharedKt;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class jg6 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jg6(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f3: MOVE (r2 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:244), block:B:40:0x00f3 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        Parcel parcel;
        Parcel parcel2;
        Parcelable parcelable;
        int i = this.b;
        okhttp3.v vVar = null;
        r2 = null;
        Parcelable parcelable2 = null;
        Parcel parcel3 = null;
        Parcel parcel4 = null;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj3;
                String str2 = (String) obj2;
                lg6 lg6Var = (lg6) obj;
                try {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.add(l.b.a(SharedKt.PARAM_ACCESS_TOKEN, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 91, false));
                    arrayList2.add(l.b.a(str, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", 0, 91, false));
                    okhttp3.h hVar = new okhttp3.h(arrayList, arrayList2);
                    p.a aVar = new p.a();
                    aVar.i(str2);
                    aVar.f("POST", hVar);
                    vVar = ((f8f0) ((okhttp3.o) lg6Var.a.invoke()).a(aVar.b())).execute().h;
                    byte[] bytes = vVar.bytes();
                    vVar.close();
                    return bytes;
                } catch (Throwable th) {
                    if (vVar != null) {
                        vVar.close();
                    }
                    throw th;
                }
            case 1:
                fwk fwkVar = (fwk) obj2;
                String str3 = (String) obj3;
                Class cls = (Class) obj;
                try {
                    try {
                        String b = fwkVar.b(str3, "app_state_cache");
                        if (b == null) {
                            b = fwkVar.b(str3, "app_persistent_state_cache");
                        }
                        if (b != null) {
                            byte[] decode = Base64.decode(b, 0);
                            parcel = Parcel.obtain();
                            try {
                                parcel.unmarshall(decode, 0, decode.length);
                                parcel.setDataPosition(0);
                                L.e("AppStateCache", "GET store: " + str3 + " - " + parcel.dataSize() + " bytes");
                                parcelable = parcel.readParcelable(cls.getClassLoader());
                                parcel3 = parcel;
                            } catch (Exception e) {
                                e = e;
                                LinkedBlockingDeque<String> linkedBlockingDeque = com.vk.core.util.state.a.a;
                                com.vk.core.util.state.a.a("GET store: can't get by uid=" + str3 + ", error=" + e);
                                if (parcel != null) {
                                    parcel.recycle();
                                }
                                return new q93(str3, parcelable2);
                            }
                        } else {
                            parcelable = null;
                        }
                        if (parcel3 != null) {
                            parcel3.recycle();
                        }
                        parcelable2 = parcelable;
                    } catch (Throwable th2) {
                        th = th2;
                        parcel4 = parcel2;
                        if (parcel4 != null) {
                            parcel4.recycle();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    parcel = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (parcel4 != null) {
                    }
                    throw th;
                }
                return new q93(str3, parcelable2);
            default:
                vfg0 vfg0Var = (vfg0) obj3;
                File file = (File) obj2;
                io.reactivex.rxjava3.subjects.f fVar = (io.reactivex.rxjava3.subjects.f) obj;
                cbr cbrVar = cbr.a;
                e2e e2eVar = vfg0Var.d;
                File a = e2eVar.j.a();
                String concat = nbr.n(file).concat("_reversed");
                cbrVar.getClass();
                File e3 = cbr.e(a, concat, "mp4");
                File e4 = cbr.e(e2eVar.j.a(), drm0.n0(file.getName(), ".").concat("_keyFrame_0"), "mp4");
                File e5 = cbr.e(e2eVar.j.a(), drm0.n0(file.getName(), ".").concat("_keyFrame_original"), "mp4");
                try {
                    try {
                        wdt0 wdt0Var = new wdt0(new tdt0(file, e3, e4, e5), vfg0Var.f, new nh(26), new uv20(fVar, 29));
                        vfg0Var.h = wdt0Var;
                        wdt0Var.d();
                        return e3;
                    } catch (Exception e6) {
                        vhk0.b(e3);
                        throw e6;
                    }
                } finally {
                    vhk0.b(e4);
                    vhk0.b(e5);
                }
        }
    }

    public /* synthetic */ jg6(fwk fwkVar, String str, Class cls) {
        this.b = 1;
        this.d = fwkVar;
        this.c = str;
        this.e = cls;
    }
}
