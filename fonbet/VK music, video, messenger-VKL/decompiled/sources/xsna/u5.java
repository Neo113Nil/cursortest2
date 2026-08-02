package xsna;

import com.vk.core.view.SimpleLikeView;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.requests.impl.requests.presentation.FriendRequestsFragment;
import com.vk.lists.AbstractPaginatedView;
import com.vk.photogallery.LocalGalleryProvider;
import java.util.List;
import xsna.dn90;
import xsna.gfc0;
import xsna.mf40;
import xsna.p810;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u5 implements SimpleLikeView.a, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, AbstractPaginatedView.g {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (s3q0) ((oac) this.c).invoke(obj, obj2);
    }

    @Override // com.vk.lists.AbstractPaginatedView.g
    public int c(int i) {
        FriendRequestsFragment friendRequestsFragment = (FriendRequestsFragment) this.c;
        int i2 = FriendRequestsFragment.d0;
        return friendRequestsFragment.io();
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (hda) ((y9a) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((e1) this.c).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((e1) this.c).invoke(obj)).booleanValue();
            case 8:
                return ((Boolean) ((bhh) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((defpackage.y) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        md90 loadEntries$lambda$10;
        switch (this.b) {
            case 1:
                return (io.reactivex.rxjava3.core.b0) ((v53) this.c).invoke(obj);
            case 2:
            case 3:
            case 6:
            case 8:
            case 11:
            case 12:
            case 14:
            case 18:
            default:
                return (io.reactivex.rxjava3.core.t) ((eo3) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.e) ((tc) this.c).invoke(obj);
            case 5:
                return (List) ((tc) this.c).invoke(obj);
            case 7:
                return (lvg) ((mf8) this.c).invoke(obj);
            case 9:
                return (ncq0) ((tc) this.c).invoke(obj);
            case 10:
                return (pao) ((bhh) this.c).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.b0) ((bhh) this.c).invoke(obj);
            case 15:
                return (NewsEntry) ((bhh) this.c).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.t) ((zxo) this.c).invoke(obj);
            case 17:
                return (List) ((vs6) this.c).invoke(obj);
            case 19:
                loadEntries$lambda$10 = LocalGalleryProvider.loadEntries$lambda$10((ruz) this.c, obj);
                return loadEntries$lambda$10;
            case 20:
                return (p810.o) ((defpackage.v) this.c).invoke(obj);
            case 21:
                return (List) ((d2y) this.c).invoke(obj);
            case 22:
                return (hda) ((mf40.g) this.c).invoke(obj);
            case 23:
                return (List) ((v53) this.c).invoke(obj);
            case 24:
                return (lu60) ((defpackage.s) this.c).invoke(obj);
            case 25:
                return (s3q0) ((cd10) this.c).invoke(obj);
            case 26:
                return (dn90.c.b) ((xmz) this.c).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.b0) ((d2y) this.c).invoke(obj);
            case 28:
                return (gfc0.b) ((eo3) this.c).invoke(obj);
        }
    }
}
