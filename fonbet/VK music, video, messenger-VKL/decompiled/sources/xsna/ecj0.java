package xsna;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.sharing.api.dto.Target;
import com.vk.superapp.bridges.dto.WebTarget;
import com.vk.superapp.navigation.api.data.AppShareType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: SharingResultsCollector.kt */
/* loaded from: classes5.dex */
public final class ecj0 {
    public final Bundle a;
    public final String b;
    public final String c;
    public final HashSet d;
    public final HashSet<AppShareType> e;

    public ecj0(Bundle bundle) {
        this.a = bundle;
        this.b = "TARGETS_SHARED";
        this.c = "APP_SHARE_TYPES_USED";
        if (epx.f(bundle, Bundle.EMPTY) || !bundle.containsKey("TARGETS_SHARED")) {
            this.d = new HashSet();
            this.e = new HashSet<>(AppShareType.values().length);
            return;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TARGETS_SHARED");
        this.d = new HashSet(parcelableArrayList.size());
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Parcelable parcelable = (Parcelable) it.next();
            if (parcelable instanceof Target) {
                this.d.add(parcelable);
            }
        }
        this.e = (HashSet) this.a.getSerializable(this.c);
    }

    public final void a(AppShareType appShareType) {
        this.e.add(appShareType);
    }

    public final Intent b() {
        Intent intent = new Intent();
        HashSet<AppShareType> hashSet = this.e;
        if (!hashSet.isEmpty()) {
            if (hashSet.contains(AppShareType.MESSAGE)) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    Target target = (Target) it.next();
                    if (!target.l) {
                        arrayList.add(new WebTarget(target.c.b, target.t, target.u, target.f, target.v.h()));
                    }
                }
                if (arrayList.isEmpty()) {
                    hashSet.remove(AppShareType.MESSAGE);
                } else {
                    intent.putParcelableArrayListExtra("targets", arrayList);
                }
            }
            Iterator<AppShareType> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                intent.putExtra(it2.next().h(), true);
            }
        }
        return intent;
    }

    public final void c(Bundle bundle) {
        HashSet hashSet = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add((Target) it.next());
        }
        bundle.putParcelableArrayList(this.b, arrayList);
        bundle.putSerializable(this.c, this.e);
    }

    public final void d(UserId userId) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (epx.f(((Target) it.next()).c, userId)) {
                it.remove();
            }
        }
    }

    public ecj0() {
        this(Bundle.EMPTY);
    }
}
