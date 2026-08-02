package xsna;

import com.vk.dto.masks.CachedMask;
import com.vk.dto.masks.Mask;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.text.Regex;

/* compiled from: MasksStorage.java */
/* loaded from: classes.dex */
public final class hi10 {
    public final ArrayList a = new ArrayList();
    public final HashMap<String, Long> b = new HashMap<>();
    public final HashMap<String, Integer> c = new HashMap<>();

    /* compiled from: MasksStorage.java */
    public class a implements io.reactivex.rxjava3.functions.f<List<CachedMask>> {
        public a() {
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(List<CachedMask> list) throws Throwable {
            for (CachedMask cachedMask : list) {
                hi10 hi10Var = hi10.this;
                hi10Var.a.add(cachedMask.Bb());
                String Db = cachedMask.Bb().Db();
                hi10Var.b.put(Db, Long.valueOf(cachedMask.zb()));
                hi10Var.c.put(Db, Integer.valueOf(cachedMask.Ab()));
            }
        }
    }

    /* compiled from: MasksStorage.java */
    public class b implements io.reactivex.rxjava3.functions.f<Throwable> {
        @Override // io.reactivex.rxjava3.functions.f
        public final /* bridge */ /* synthetic */ void accept(Throwable th) throws Throwable {
        }
    }

    public hi10() {
        wmi0.a.e("masks_list_v2").subscribe(new a(), new b());
    }

    public final void a() {
        this.a.clear();
        this.c.clear();
        this.b.clear();
        wmi0.a.c("masks_list_v2");
        File p = f9t.p();
        Regex regex = com.vk.core.files.a.a;
        vhk0.d(p);
        vhk0.d(f9t.g());
    }

    public final void b(Mask mask) {
        String Db = mask.Db();
        this.a.remove(mask);
        this.c.remove(Db);
        this.b.remove(Db);
        asu0.a.getClass();
        asu0.h().submit(new to2(mask, 8));
    }

    public final void c() {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.a;
            if (i >= arrayList2.size()) {
                wmi0.a.m("masks_list_v2", arrayList);
                return;
            }
            Mask mask = (Mask) arrayList2.get(i);
            String Db = mask.Db();
            Integer num = this.c.get(Db);
            Long l = this.b.get(Db);
            arrayList.add(new CachedMask(mask, num != null ? num.intValue() : 0, l != null ? l.longValue() : 0L));
            i++;
        }
    }

    public final int d(Mask mask) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (((Mask) arrayList.get(i)).Gb(mask)) {
                return i;
            }
            i++;
        }
    }
}
