package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.OnFailureListener;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.articles.ArticleFragment;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.content.design.view.camera.MasksWrap;
import com.vk.feed.design.view.newsfeed.reaction.FeedAnimatedView;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.newsfeed.impl.drafts.DraftsFeedFragment;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PlacesPage;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.io.FileNotFoundException;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.f0g0;
import xsna.mfh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class jo3 implements io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.g, Toolbar.h, pcs, SwipeDrawableRefreshLayout.g, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.core.n, f0g0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jo3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i2 = ArticleFragment.E0;
                return (String) ((io3) obj2).invoke(obj);
            case 1:
            case 5:
            case 10:
            case 13:
            case 15:
            case 17:
            case 18:
            case 23:
            default:
                return (PlacesPage) ((wkb) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((gd5) obj2).invoke(obj);
            case 3:
                return (io.reactivex.rxjava3.core.b0) ((o9) obj2).invoke(obj);
            case 4:
                return (MsgFromChannel) ((z2b) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((r3e) obj2).invoke(obj);
            case 7:
                return ((mfh.b) obj2).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.t) ((f1j) obj2).invoke(obj);
            case 9:
                return (j170) ((f1j) obj2).invoke(obj);
            case 11:
                return (drq) ((o9) obj2).invoke(obj);
            case 12:
                int i3 = FeedAnimatedView.y;
                return (io.reactivex.rxjava3.core.t) ((o9) obj2).invoke(obj);
            case 14:
                return (Drawable) obj2;
            case 16:
                return (o0c) ((io3) obj2).invoke(obj);
            case 19:
                return (MarketMarketItemDto) ((io3) obj2).invoke(obj);
            case 20:
                return (chu) ((f1j) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.b0) ((amp) obj2).invoke(obj);
            case 22:
                return (b4g0) ((izs) obj2).invoke(obj);
            case 24:
                return (io.reactivex.rxjava3.core.b0) ((yk30) obj2).invoke(obj);
            case 25:
                return (hda) ((lf40) obj2).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.b0) ((js00) obj2).invoke(obj);
        }
    }

    @Override // xsna.f0g0.b
    public void b(long j, xi90 xi90Var) {
        yla.a(j, xi90Var, ((e6i0) this.c).b);
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (xbu0) ((n35) this.c).invoke(obj, obj2, obj3);
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        UsableRecyclerPaginatedView.a aVar = ((FeedRecyclerPaginatedView) this.c).R;
        if (aVar != null) {
            aVar.h();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        ((orb) this.c).b.a(menuItem.getItemId());
        return true;
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        DraftsFeedFragment draftsFeedFragment = (DraftsFeedFragment) this.c;
        int i = DraftsFeedFragment.o0;
        draftsFeedFragment.finish();
    }

    @Override // io.reactivex.rxjava3.core.n
    public void subscribe(io.reactivex.rxjava3.core.l lVar) {
        Uri uri = (Uri) this.c;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            throw new FileNotFoundException(i6n0.a(uri, "Cannot open uri: "));
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor.getFileDescriptor(), null, options);
            if (decodeFileDescriptor == null) {
                decodeFileDescriptor = BitmapFactory.decodeFile(uri.getPath(), options);
            }
            ((c.a) lVar).f(decodeFileDescriptor);
            s3q0 s3q0Var = s3q0.a;
            openAssetFileDescriptor.close();
        } finally {
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        f1j f1jVar = (f1j) this.c;
        switch (i) {
            case 15:
                break;
            default:
                int i2 = MasksWrap.e0;
                break;
        }
        return ((Boolean) f1jVar.invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(final io.reactivex.rxjava3.core.y yVar) {
        e3u e3uVar = (e3u) this.c;
        e3uVar.g().a().addOnFailureListener(new OnFailureListener() { // from class: xsna.b3u
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                io.reactivex.rxjava3.core.y.this.onError(exc);
            }
        }).addOnSuccessListener(new c3u(new mh4(15, e3uVar, yVar), 0));
    }
}
