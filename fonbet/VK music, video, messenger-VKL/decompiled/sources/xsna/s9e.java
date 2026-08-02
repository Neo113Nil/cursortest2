package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.vk.clips.blacklists.api.di.ClipsBlacklistsComponent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import xsna.lr10;

/* compiled from: ClipsGallerySelectionUtils.kt */
/* loaded from: classes16.dex */
public final class s9e {
    public final bpn0 a;
    public final Lazy<ClipsBlacklistsComponent> b;
    public final bpn0 c;
    public final bpn0 d = new bpn0(new no(this, 24));

    public s9e(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        this.a = bpn0Var2;
        this.b = bpn0Var3;
        this.c = bpn0Var;
    }

    public static List a(Intent intent) {
        Bundle bundleExtra;
        if (intent == null || (bundleExtra = intent.getBundleExtra("result_attachments")) == null) {
            return EmptyList.b;
        }
        ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("result_files");
        boolean[] booleanArray = bundleExtra.getBooleanArray("result_video_flags");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty() || booleanArray == null || booleanArray.length == 0) {
            return EmptyList.b;
        }
        ArrayList arrayList = new ArrayList(c5g.u(parcelableArrayList, 10));
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            String path = ((Uri) it.next()).getPath();
            if (path == null) {
                path = "";
            }
            arrayList.add(new File(path));
        }
        List<Boolean> v0 = rl3.v0(booleanArray);
        Iterator it2 = arrayList.iterator();
        Iterator<T> it3 = v0.iterator();
        ArrayList arrayList2 = new ArrayList(Math.min(c5g.u(arrayList, 10), c5g.u(v0, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            File file = (File) it2.next();
            arrayList2.add(((Boolean) it3.next()).booleanValue() ? new lr10.b(file) : new lr10.a(file, 5000L));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (vhk0.g(((lr10) next).a)) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }
}
