package xsna;

import android.content.Context;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.lists.ListDataSet;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.ikv0;
import xsna.q3u0;

/* compiled from: ViewerSelectionTouchListener.kt */
/* loaded from: classes15.dex */
public final class p3u0 extends kfi0 {
    public final o4t C;
    public final RecyclerView D;
    public final List<r3u0> E;
    public final o3u0 F;
    public final wzs<Integer, MediaStoreEntry, s3q0> G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3u0(o4t o4tVar, RecyclerView recyclerView, com.vk.attachpicker.b bVar, t4t t4tVar, h7v h7vVar, q3t q3tVar, List list, PhotoSmallAdapter photoSmallAdapter, wzs wzsVar) {
        super(recyclerView, bVar, t4tVar.j, t4tVar.v, h7vVar, q3tVar, photoSmallAdapter);
        o3u0 o3u0Var = new o3u0();
        this.C = o4tVar;
        this.D = recyclerView;
        this.E = list;
        this.F = o3u0Var;
        this.G = wzsVar;
    }

    public final q3u0 D(MediaStoreEntry mediaStoreEntry) {
        q3u0 q3u0Var = q3u0.b.a;
        List list = this.E;
        if (list == null) {
            list = EmptyList.b;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q3u0Var = ((r3u0) it.next()).a(mediaStoreEntry);
            if (q3u0Var instanceof q3u0.a) {
                break;
            }
        }
        return q3u0Var;
    }

    @Override // xsna.kfi0
    public final void y(int i, MediaStoreEntry mediaStoreEntry) {
        String path = mediaStoreEntry.f().getPath();
        if (path == null || path.length() == 0) {
            return;
        }
        o4t o4tVar = this.C;
        if (o4tVar.isShowing()) {
            return;
        }
        q3u0 D = D(mediaStoreEntry);
        if (!(D instanceof q3u0.b)) {
            if (!(D instanceof q3u0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = this.D.getContext();
            int i2 = ((q3u0.a) D).a;
            this.F.getClass();
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
            aVar.u = new ikv0.d(context.getString(i2), (String) null, (ikv0.d.a) null, 6);
            aVar.n();
            return;
        }
        wzs<Integer, MediaStoreEntry, s3q0> wzsVar = this.G;
        if (wzsVar != null) {
            wzsVar.invoke(Integer.valueOf(i), mediaStoreEntry);
            return;
        }
        PhotoSmallAdapter photoSmallAdapter = this.B;
        int K0 = i - photoSmallAdapter.K0();
        ArrayList arrayList = ((ListDataSet) photoSmallAdapter.c).d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof MediaStoreEntry) {
                arrayList2.add(next);
            }
        }
        photoSmallAdapter.K0();
        t4t t4tVar = o4tVar.d;
        boolean z = t4tVar.l;
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = t4tVar.E;
        boolean z2 = z && !t4tVar.m;
        com.vk.attachpicker.b bVar = o4tVar.f;
        gea0 gea0Var = o4tVar.c;
        boolean z3 = t4tVar.a;
        long j = t4tVar.e;
        long j2 = t4tVar.d;
        long j3 = t4tVar.f;
        boolean z4 = t4tVar.j;
        int intValue = ((Number) o4tVar.l.invoke()).intValue();
        boolean z5 = t4tVar.y;
        com.vk.core.simplescreen.a d = o4tVar.d();
        String str = o4tVar.e;
        Integer num = t4tVar.F;
        boolean z6 = galleryPickerSourceConfiguration.e;
        boolean z7 = galleryPickerSourceConfiguration.h;
        boolean z8 = galleryPickerSourceConfiguration.g;
        boolean z9 = galleryPickerSourceConfiguration.f;
        com.vk.attachpicker.screen.p pVar = new com.vk.attachpicker.screen.p(arrayList2, K0, bVar, gea0Var, false, z3, false, j, j2, j3, z4, z2, intValue, z5, d, str, num, z6 || z9 || z8 || z7, o4tVar.p, o4tVar.j, null);
        List<r3u0> list = o4tVar.i;
        if (list != null) {
            for (r3u0 r3u0Var : list) {
                if (pVar.W == null) {
                    pVar.W = new ArrayList();
                }
                pVar.W.add(r3u0Var);
            }
        }
        pVar.X = o4tVar.r;
        pVar.Y = o4tVar.g;
        pVar.Z = o4tVar.h;
        pVar.c0 = o4tVar.k;
        pVar.d0 = galleryPickerSourceConfiguration.b;
        pVar.a0 = t4tVar.H;
        pVar.e0 = galleryPickerSourceConfiguration.j;
        o4tVar.m = pVar;
        if (z9 || z8 || z7) {
            dhr0.u0(o4tVar.d().getWindow(), NavigationBarStyle.DARK);
        }
        o4tVar.d().show();
        o4tVar.d().setOnDismissListener(new p43(o4tVar, 1));
        o4tVar.d().b(pVar);
        pVar.K();
        this.A.d(mediaStoreEntry.f());
    }

    @Override // xsna.kfi0
    public final void z(int i, gz10 gz10Var) {
        String path;
        if (gz10Var != null) {
            MediaStoreEntry mediaStoreEntry = gz10Var.t;
            if (mediaStoreEntry == null) {
                mediaStoreEntry = null;
            }
            if (mediaStoreEntry == null || (path = mediaStoreEntry.f().getPath()) == null || path.length() == 0 || this.C.isShowing()) {
                return;
            }
            q3u0 D = D(mediaStoreEntry);
            if (D instanceof q3u0.b) {
                C(i, gz10Var);
                return;
            }
            if (!(D instanceof q3u0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = this.D.getContext();
            int i2 = ((q3u0.a) D).a;
            this.F.getClass();
            ikv0.a aVar = new ikv0.a(context);
            aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_accent), (Size) null, 12);
            aVar.u = new ikv0.d(context.getString(i2), (String) null, (ikv0.d.a) null, 6);
            aVar.n();
        }
    }
}
