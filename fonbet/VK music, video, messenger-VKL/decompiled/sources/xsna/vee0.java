package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import com.vk.video.ui.upload.impl.publish.domain.model.CoverDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoAuthorDo;
import com.vk.video.ui.upload.impl.publish.domain.model.VideoInfoDo;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.fragment.VideoAlbumResultData;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.author.AuthorType;
import com.vk.video.ui.upload.impl.publish.presentation.publish.compose.title.TitleViewState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.kdh0;
import xsna.tlo0;
import xsna.u2k;

/* compiled from: PublishViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class vee0 implements izs<PublishState, kdh0> {
    public final Context b;
    public final fks0 c;

    public vee0(Context context, fks0 fks0Var) {
        this.b = context;
        this.c = fks0Var;
    }

    public static uzi0 c(PublishState publishState) {
        return new uzi0(tq.h(tlo0.Companion, R.string.setting_description_title), publishState.g.length() > 0 ? new tlo0.h(publishState.g) : null, false);
    }

    public static uzi0 d(PublishState publishState) {
        return new uzi0(tq.h(tlo0.Companion, R.string.video_publish_edit_privacy_comments), new tlo0.h(publishState.r.d), false);
    }

    public static uzi0 e(PublishState publishState) {
        return new uzi0(tq.h(tlo0.Companion, R.string.video_publish_edit_privacy), new tlo0.h(publishState.p.d), false);
    }

    public static uzi0 g(PublishState publishState) {
        tlo0 fVar;
        boolean z = publishState.m;
        Date date = publishState.n;
        if (!z) {
            return null;
        }
        tlo0.f h = tq.h(tlo0.Companion, R.string.setting_publication_date_title);
        if (date != null) {
            String i = pvo0.i(false, (int) TimeUnit.MILLISECONDS.toSeconds(date.getTime()), false, true);
            if (i.length() > 0) {
                i = ((Object) String.valueOf(i.charAt(0)).toUpperCase(Locale.ROOT)) + i.substring(1);
            }
            fVar = new tlo0.h(i);
        } else {
            fVar = new tlo0.f(R.string.setting_publication_date_subtitle_now);
        }
        return new uzi0(h, fVar, date != null);
    }

    public static skk0 k(PublishState publishState) {
        boolean z = publishState.N || publishState.O;
        boolean z2 = publishState.P;
        if (z || z2) {
            return new skk0(z);
        }
        return null;
    }

    public static TitleViewState l(PublishState publishState) {
        return new TitleViewState(publishState.e, ((Boolean) publishState.V.getValue()).booleanValue() ? TitleViewState.ErrorType.SHORT : ((Boolean) publishState.W.getValue()).booleanValue() ? TitleViewState.ErrorType.LONG : null, publishState.f);
    }

    public static tlo0.f n(PublishState publishState) {
        tlo0.a aVar;
        int i;
        PublishState.Block block = publishState.b;
        if (block instanceof PublishState.Upload) {
            aVar = tlo0.Companion;
            i = R.string.toolbar_title_publish;
        } else {
            if (!(block instanceof PublishState.Edit)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = tlo0.Companion;
            i = R.string.toolbar_title_edit;
        }
        return tq.h(aVar, i);
    }

    public final m3k a(PublishState publishState) {
        u2k u2kVar;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        VideoInfoDo videoInfoDo = publishState.c;
        int seconds = (int) timeUnit.toSeconds(videoInfoDo != null ? videoInfoDo.b : 0L);
        String a = z8s.a(seconds);
        if (a.charAt(0) == '0') {
            a = "0".concat(a);
        }
        String c = new coo(this.b).c(seconds);
        CoverDo coverDo = publishState.d;
        if (coverDo instanceof CoverDo.Preview) {
            Bitmap bitmap = ((CoverDo.Preview) coverDo).b;
            u2kVar = bitmap != null ? new u2k.c(bitmap) : u2k.a.a;
        } else if (coverDo instanceof CoverDo.Local) {
            u2kVar = new u2k.b(((CoverDo.Local) coverDo).b);
        } else if (coverDo instanceof CoverDo.Remote) {
            String str = ((CoverDo.Remote) coverDo).b;
            u2kVar = str != null ? new u2k.d(str) : u2k.a.a;
        } else {
            if (coverDo != null) {
                throw new NoWhenBranchMatchedException();
            }
            u2kVar = u2k.a.a;
        }
        return new m3k(u2kVar, oq.d(tlo0.Companion, a), tlo0.a.c(R.string.setting_cover_talkback, c));
    }

    public final uzi0 h(PublishState publishState) {
        tlo0 d;
        tlo0.f h = tq.h(tlo0.Companion, R.string.setting_albums_title);
        List<VideoAlbumResultData> list = publishState.A;
        List<VideoAlbumResultData> list2 = list;
        tlo0 tlo0Var = null;
        tlo0Var = null;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((VideoAlbumResultData) it.next()).b >= 0) {
                    if (this.c.i1()) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list) {
                            if (((VideoAlbumResultData) obj).b >= 0) {
                                arrayList.add(obj);
                            }
                        }
                        String g0 = j5g.g0(arrayList, null, null, null, 0, new juz(20), 31);
                        String str = g0.length() > 0 ? g0 : null;
                        d = str != null ? oq.d(tlo0.Companion, str) : tq.h(tlo0.Companion, R.string.no_album_chosen);
                    } else {
                        d = oq.d(tlo0.Companion, j5g.g0(list, null, null, null, 0, new bws(15), 31));
                    }
                    tlo0Var = d;
                }
            }
        }
        return new uzi0(h, tlo0Var, false);
    }

    @Override // xsna.izs
    public final kdh0 invoke(PublishState publishState) {
        PublishState publishState2 = publishState;
        VideoInfoDo videoInfoDo = publishState2.c;
        PublishState.Block block = publishState2.b;
        boolean z = publishState2.I;
        Date date = publishState2.n;
        if (videoInfoDo == null) {
            return new kdh0.b(n(publishState2));
        }
        boolean z2 = block instanceof PublishState.Edit;
        if (z2 && ((PublishState.Edit) block).Z1()) {
            return new kdh0.a(n(publishState2), k(publishState2), new p48(new b48(tq.h(tlo0.Companion, R.string.bottom_bar_button_draft_save), publishState2.B()), new b48(date != null ? new tlo0.f(R.string.bottom_bar_button_draft_postpone) : new tlo0.f(R.string.bottom_bar_button_publish), publishState2.B())), publishState2.M, a(publishState2), null, l(publishState2), c(publishState2), h(publishState2), e(publishState2), d(publishState2), g(publishState2), new szi0(new tlo0.f(R.string.onboarding_advanced_edit_title), z), publishState2.L, publishState2.o, publishState2.J);
        }
        ld5 ld5Var = null;
        r3 = null;
        uzi0 uzi0Var = null;
        ld5Var = null;
        if (z2) {
            tlo0.f n = n(publishState2);
            skk0 k = k(publishState2);
            p48 p48Var = new p48(null, new b48(date != null ? tq.h(tlo0.Companion, R.string.bottom_bar_button_publish_postpone) : tq.h(tlo0.Companion, R.string.bottom_bar_button_edit_save), publishState2.B()));
            f9k0 f9k0Var = publishState2.M;
            m3k a = a(publishState2);
            TitleViewState l = l(publishState2);
            uzi0 c = c(publishState2);
            if (this.c.i1() && fkq0.b(publishState2.h)) {
                uzi0Var = h(publishState2);
            }
            return new kdh0.a(n, k, p48Var, f9k0Var, a, null, l, c, uzi0Var, e(publishState2), d(publishState2), g(publishState2), new szi0(tq.h(tlo0.Companion, R.string.onboarding_advanced_edit_title), z), publishState2.L, publishState2.o, publishState2.J);
        }
        tlo0.f n2 = n(publishState2);
        skk0 k2 = k(publishState2);
        p48 p48Var2 = new p48(null, new b48(date != null ? tq.h(tlo0.Companion, R.string.bottom_bar_button_publish_postpone) : tq.h(tlo0.Companion, R.string.bottom_bar_button_publish), publishState2.B()));
        f9k0 f9k0Var2 = publishState2.M;
        m3k a2 = a(publishState2);
        boolean z3 = publishState2.l;
        VideoAuthorDo videoAuthorDo = publishState2.k;
        if (z3 && videoAuthorDo != null) {
            String str = videoAuthorDo.d;
            if (str == null) {
                str = "";
            }
            tlo0.a aVar = tlo0.Companion;
            String str2 = videoAuthorDo.e;
            ld5Var = new ld5(str, oq.d(aVar, str2 != null ? str2 : ""), fkq0.b(videoAuthorDo.b) ? AuthorType.CHANNEL : AuthorType.PROFILE);
        }
        return new kdh0.a(n2, k2, p48Var2, f9k0Var2, a2, ld5Var, l(publishState2), c(publishState2), h(publishState2), e(publishState2), d(publishState2), g(publishState2), new szi0(tq.h(tlo0.Companion, R.string.onboarding_advanced_video_publish_title), z), publishState2.L, publishState2.o, publishState2.J);
    }
}
