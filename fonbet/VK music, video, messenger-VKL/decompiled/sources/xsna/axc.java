package xsna;

import android.content.Context;
import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.LazyThreadSafetyMode;
import xsna.olh0;
import xsna.v7e;

/* compiled from: ClipFeedLikeHelper.kt */
/* loaded from: classes17.dex */
public final class axc {
    public static final List<BaseUserGroupFieldsDto> g = e43.l(BaseUserGroupFieldsDto.SEX, BaseUserGroupFieldsDto.VIDEO_FILES, BaseUserGroupFieldsDto.TRENDING, BaseUserGroupFieldsDto.VERIFIED, BaseUserGroupFieldsDto.IS_FAVORITE, BaseUserGroupFieldsDto.EMOJI_STATUS, BaseUserGroupFieldsDto.IMAGE_STATUS, BaseUserGroupFieldsDto.IS_NFT, BaseUserGroupFieldsDto.IS_NFT_PHOTO, BaseUserGroupFieldsDto.IS_ESIA_VERIFIED, BaseUserGroupFieldsDto.IS_TINKOFF_VERIFIED, BaseUserGroupFieldsDto.IS_SBER_VERIFIED, BaseUserGroupFieldsDto.PHOTO_BASE, BaseUserGroupFieldsDto.URL);
    public final Context a;
    public final n9x0 b;
    public final mgj0 c;
    public final xxq d;
    public final io.reactivex.rxjava3.disposables.b e;
    public final Object f = msy.a(LazyThreadSafetyMode.NONE, new ig(4));

    public axc(Context context, n9x0 n9x0Var, mgj0 mgj0Var, v7e.b bVar, io.reactivex.rxjava3.disposables.b bVar2) {
        this.a = context;
        this.b = n9x0Var;
        this.c = mgj0Var;
        this.d = bVar;
        this.e = bVar2;
    }

    public static void a(ClipVideoFile clipVideoFile) {
        ClipVideoFile Kb = ClipVideoFile.Kb(clipVideoFile, true, null, null, null, null, null, null, 8388479);
        Kb.u++;
        wjs0.a(new fyr0(Kb));
    }

    public static void c(ClipVideoFile clipVideoFile) {
        r9.u--;
        wjs0.a(new fyr0(ClipVideoFile.Kb(clipVideoFile, false, null, null, null, null, null, null, 8388479)));
    }

    public final void b(ClipVideoFile clipVideoFile) {
        nlh0 d = d(clipVideoFile);
        if (d == null) {
            return;
        }
        VideoFile A = k15.A(d.k());
        ClipVideoFile clipVideoFile2 = A instanceof ClipVideoFile ? (ClipVideoFile) A : null;
        if (clipVideoFile2 == null) {
            return;
        }
        c(clipVideoFile2);
        dz2 x = yfb.x(this.c.q(clipVideoFile2.c, clipVideoFile2.b, b6m.b(this.a)));
        x.d = true;
        x.c = true;
        this.e.b(rsg0.w0(x).subscribe(new eu0(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(d, 21), 11), new y50(new dg(d, this), 13)));
    }

    public final nlh0 d(VideoFile videoFile) {
        Object obj;
        Iterator<T> it = this.d.getCurrentItems().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            FeedItem feedItem = (FeedItem) obj;
            if (!(feedItem instanceof FeedItem.d) ? false : epx.f(((FeedItem.d) feedItem).k().r1(), videoFile.r1())) {
                break;
            }
        }
        FeedItem.d dVar = obj instanceof FeedItem.d ? (FeedItem.d) obj : null;
        if (dVar != null) {
            return dVar.W();
        }
        return null;
    }

    public final void e(VideoFile videoFile) {
        nlh0 d = d(videoFile);
        if (d == null) {
            return;
        }
        VideoFile A = k15.A(d.k());
        int i = 0;
        if (o25.a().b()) {
            int i2 = 2;
            if (A.O9()) {
                nlh0 d2 = d(A);
                if (d2 == null) {
                    return;
                }
                tci.w(d2).f(this.a, new ywc(A, d2, this, i), new yk(i2, A, d2));
                return;
            }
            nlh0 d3 = d(A);
            if (d3 == null) {
                return;
            }
            if (A instanceof ClipVideoFile) {
                ClipVideoFile clipVideoFile = (ClipVideoFile) A;
                if (clipVideoFile.X1) {
                    ConcurrentHashMap.KeySetView keySetView = zed.a;
                    clipVideoFile.X1 = false;
                    zed.a.remove(clipVideoFile.a1());
                    d3.d(Collections.singletonList(new olh0.b(false)));
                }
            }
            tci.w(d3).f(this.a, new zwc(A, d3, this, i), new com.vk.movika.tools.controls.seekbar.g(i2, A, d3));
            return;
        }
        if (A instanceof ClipVideoFile) {
            ClipVideoFile clipVideoFile2 = (ClipVideoFile) A;
            if (clipVideoFile2.J1) {
                b(clipVideoFile2);
                return;
            }
            if (clipVideoFile2.X1) {
                ConcurrentHashMap.KeySetView keySetView2 = zed.a;
                clipVideoFile2.X1 = false;
                zed.a.remove(clipVideoFile2.a1());
                clipVideoFile2.X1 = false;
            }
            nlh0 d4 = d(clipVideoFile2);
            if (d4 == null) {
                return;
            }
            a(clipVideoFile2);
            mgj0 mgj0Var = this.c;
            String b = b6m.b(this.a);
            dz2 x = yfb.x(mgj0Var.m(clipVideoFile2.c, clipVideoFile2.b, b));
            x.d = true;
            x.c = true;
            this.e.b(rsg0.w0(x).subscribe(new n20(new com.vk.im.engine.internal.storage.delegates.messages.b(d4, 25), 16), new f60(new by5(5, d4, this), 14)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(ClipVideoFile clipVideoFile) {
        lax0 lax0Var = (lax0) this.f.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(clipVideoFile.b);
        sb.append('_');
        sb.append(clipVideoFile.x1);
        this.e.b(rsg0.W(yfb.x(lax0Var.h(Collections.singletonList(sb.toString()), g)), 7).l(new rf1(new gr3(this, 12), 10)).subscribe());
    }
}
