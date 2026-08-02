package xsna;

import com.vk.dto.common.Attachment;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.core.models.header.EntryHeader;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.EmptyList;

/* compiled from: Utils.kt */
/* loaded from: classes11.dex */
public final class up70 implements gn60, i100 {
    public Object b;

    public /* synthetic */ up70(Object obj) {
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List a(int i, Triple triple) {
        boolean z;
        Attachment R1;
        pa2 pa2Var = (pa2) this.b;
        Photos photos = (Photos) triple.d();
        NewsEntry newsEntry = (NewsEntry) triple.g();
        s1c0 s1c0Var = (s1c0) triple.h();
        boolean J = photos.J();
        int i2 = photos.p;
        int T9 = photos.T9();
        int E1 = photos.E1();
        int i7 = photos.i7();
        boolean z2 = E1 > 0;
        boolean z3 = i7 > 0;
        boolean z4 = photos.T9() == 0 && s1c0Var.i;
        EntryHeader entryHeader = photos.t;
        if ((entryHeader != null ? entryHeader.h : null) == null) {
            if ((di60.q(photos) ? i2 : 0) > 0) {
                z = true;
                String z5 = sa30.z(E1, s1c0Var);
                String z6 = sa30.z(T9, s1c0Var);
                String z7 = sa30.z(0, s1c0Var);
                String z8 = sa30.z(i7, s1c0Var);
                int i3 = !di60.q(photos) ? i2 : 0;
                boolean z9 = photos.T9() <= 0;
                boolean z10 = !(photos.r != 1 && (((R1 = photos.R1()) != null && fdi.t(R1)) || !photos.b9()));
                int A = sa30.A(photos);
                boolean a = pa2.a(photos);
                boolean I = di60.I(photos);
                int b = di60.I(photos) ? 0 : cn70.b(8);
                boolean b2 = ((h170) pa2Var.b).b();
                Post post = newsEntry instanceof Post ? (Post) newsEntry : null;
                boolean Tb = post == null ? post.Tb() : false;
                EmptyList emptyList = EmptyList.b;
                return Collections.singletonList(new q6s(J, false, false, null, null, null, null, 0, 0, T9, E1, i7, 0, -1, z6, z5, z8, z7, false, false, R.string.video_remove_from_added, 0, true, z2, z9, z3, z10, A, false, z, a, true, z4, false, I, b, false, false, false, 0, 0, false, false, b2, Tb, emptyList, emptyList, false, i3, tni.i(photos), false, photos, newsEntry, 0));
            }
        }
        z = false;
        String z52 = sa30.z(E1, s1c0Var);
        String z62 = sa30.z(T9, s1c0Var);
        String z72 = sa30.z(0, s1c0Var);
        String z82 = sa30.z(i7, s1c0Var);
        if (!di60.q(photos)) {
        }
        if (photos.T9() <= 0) {
        }
        boolean z102 = !(photos.r != 1 && (((R1 = photos.R1()) != null && fdi.t(R1)) || !photos.b9()));
        int A2 = sa30.A(photos);
        boolean a2 = pa2.a(photos);
        boolean I2 = di60.I(photos);
        if (di60.I(photos)) {
        }
        boolean b22 = ((h170) pa2Var.b).b();
        if (newsEntry instanceof Post) {
        }
        if (post == null) {
        }
        EmptyList emptyList2 = EmptyList.b;
        return Collections.singletonList(new q6s(J, false, false, null, null, null, null, 0, 0, T9, E1, i7, 0, -1, z62, z52, z82, z72, false, false, R.string.video_remove_from_added, 0, true, z2, z9, z3, z102, A2, false, z, a2, true, z4, false, I2, b, false, false, false, 0, 0, false, false, b22, Tb, emptyList2, emptyList2, false, i3, tni.i(photos), false, photos, newsEntry, 0));
    }

    @Override // xsna.i100
    public void j(String str, gzs gzsVar) {
        ((cdi) this.b).j(str, gzsVar);
    }

    @Override // xsna.i100
    public void k(gzs gzsVar) {
        ((cdi) this.b).k(gzsVar);
    }

    @Override // xsna.i100
    public void m(String str, gzs gzsVar) {
        ((cdi) this.b).m(str, gzsVar);
    }

    @Override // xsna.i100
    public void o(String str, gzs gzsVar) {
        if (wn80.q) {
            ((cdi) this.b).o(str, gzsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gn60
    public /* bridge */ /* synthetic */ List x(Pair pair, bp5 bp5Var) {
        return a(0, (Triple) pair);
    }
}
