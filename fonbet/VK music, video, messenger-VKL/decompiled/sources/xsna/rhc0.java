package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.geo_picker.presentation.model.PickerPlaceDto;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SavePickTime;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction$TechStats$Picker$SaveTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.posting.impl.presentation.model.FileDto;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPlaceDto;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$PickerType;
import com.vkontakte.android.R;
import java.util.Date;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.xn50;

/* compiled from: PostingNavigator.kt */
/* loaded from: classes4.dex */
public final class rhc0 implements w8i {
    public final PostingFragment b;
    public final PostingFragment c;
    public final b010 d;
    public final kr50 e;
    public final gd40 f;
    public final re40 g;
    public final f h;
    public final e i;
    public final d j;
    public final b k;
    public final c l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final i6a0 r;
    public final n0w0 s;
    public final vcv0 t;
    public final eed0 u;

    /* compiled from: PostingNavigator.kt */
    public static final class a {
        public final PostingFragment a;

        public a(PostingFragment postingFragment) {
            this.a = postingFragment;
        }
    }

    /* compiled from: PostingNavigator.kt */
    public static final class b implements euk {
        public final PostingFragment a;

        public b(PostingFragment postingFragment) {
            this.a = postingFragment;
        }

        @Override // xsna.euk
        public final void a(boolean z) {
            if (z) {
                return;
            }
            xn50.a.c(this.a, new PostingAction.Navigation.Close(false, false, false, 6, null));
        }
    }

    /* compiled from: PostingNavigator.kt */
    public static final class c implements w9r {
        public final PostingFragment b;

        public c(PostingFragment postingFragment) {
            this.b = postingFragment;
        }

        @Override // xsna.w9r
        public final void Wg(FileDto fileDto) {
            xn50.a.c(this.b, new PostingAction.Editing.Attach.SetFile(fileDto));
        }

        @Override // xsna.w9r
        public final void ne(Long l, Long l2) {
            xn50.a.c(this.b, new PostingAction$TechStats$Picker$SavePickTime(MobileOfficialAppsFeedStat$PickerType.DOCUMENT, l2, l));
        }
    }

    /* compiled from: PostingNavigator.kt */
    public static final class d implements ru40 {
        public final PostingFragment a;
        public final gd40 b;

        public d(PostingFragment postingFragment, gd40 gd40Var) {
            this.a = postingFragment;
            this.b = gd40Var;
        }

        @Override // xsna.ru40
        public final void a(PickerTechMetrics pickerTechMetrics) {
            xn50.a.c(this.a, new PostingAction$TechStats$Picker$SaveTechMetrics(MobileOfficialAppsFeedStat$PickerType.MUSIC, pickerTechMetrics));
        }

        @Override // xsna.ru40
        public final void b() {
            ((ibc0) this.b.invoke()).u().b();
        }

        @Override // xsna.ru40
        public final void c(PostingAttachmentInfo postingAttachmentInfo) {
            ((ibc0) this.b.invoke()).u().c(postingAttachmentInfo);
        }

        @Override // xsna.ru40
        public final void d(PostingAttachmentInfo postingAttachmentInfo) {
            ((ibc0) this.b.invoke()).u().d(postingAttachmentInfo);
        }

        @Override // xsna.ru40
        public final void e(MusicDto musicDto) {
            xn50.a.c(this.a, new PostingAction.Editing.Attach.SetMusicSnippet(musicDto));
        }

        @Override // xsna.ru40
        public final void f(MusicDto musicDto) {
            xn50.a.c(this.a, new PostingAction.Editing.Attach.SetMusicPlaylist(musicDto));
        }

        @Override // xsna.ru40
        public final void g(boolean z) {
            gd40 gd40Var = this.b;
            if (z) {
                ((ibc0) gd40Var.invoke()).u().a();
            } else {
                ((ibc0) gd40Var.invoke()).u().F();
            }
        }

        @Override // xsna.ru40
        public final void h() {
            ((ibc0) this.b.invoke()).u().x();
        }

        @Override // xsna.ru40
        public final void i() {
            ((ibc0) this.b.invoke()).u().q();
        }

        @Override // xsna.ru40
        public final void j() {
            xn50.a.c(this.a, PostingAction.Hints.RemoveMusicSnippetOnboardingHint.b);
        }

        @Override // xsna.ru40
        public final void k(List<MusicDto> list) {
            xn50.a.c(this.a, new PostingAction.Editing.Attach.SetMusicTracks(list));
        }
    }

    /* compiled from: PostingNavigator.kt */
    public static final class e implements wqa0 {
        public final PostingFragment a;

        public e(PostingFragment postingFragment) {
            this.a = postingFragment;
        }

        @Override // xsna.wqa0
        public final void a(PickerTechMetrics pickerTechMetrics) {
            xn50.a.c(this.a, new PostingAction$TechStats$Picker$SaveTechMetrics(MobileOfficialAppsFeedStat$PickerType.PLACE, pickerTechMetrics));
        }

        @Override // xsna.wqa0
        public final void b(PickerPlaceDto pickerPlaceDto) {
            xn50.a.c(this.a, new PostingAction.Editing.Attach.SetPlace(new PostingPlaceDto(pickerPlaceDto.b, pickerPlaceDto.c, pickerPlaceDto.d, pickerPlaceDto.e), false));
        }
    }

    /* compiled from: PostingNavigator.kt */
    public static final class f implements kob0 {
        public final PostingFragment a;

        public f(PostingFragment postingFragment) {
            this.a = postingFragment;
        }

        @Override // xsna.kob0
        public final void a(PickerTechMetrics pickerTechMetrics) {
            xn50.a.c(this.a, new PostingAction$TechStats$Picker$SaveTechMetrics(MobileOfficialAppsFeedStat$PickerType.POLL, pickerTechMetrics));
        }

        @Override // xsna.kob0
        public final void b(PostingPollDto postingPollDto) {
            xn50.a.c(this.a, new PostingAction.Editing.Attach.SetPoll(postingPollDto));
        }

        @Override // xsna.kob0
        public final void c() {
            xn50.a.c(this.a, PostingAction.Editing.Attach.RemovePoll.b);
        }
    }

    public rhc0(PostingFragment postingFragment, PostingFragment postingFragment2, b010 b010Var, kr50 kr50Var, gd40 gd40Var, re40 re40Var) {
        this.b = postingFragment;
        this.c = postingFragment2;
        this.d = b010Var;
        this.e = kr50Var;
        this.f = gd40Var;
        this.g = re40Var;
        this.h = new f(postingFragment2);
        this.i = new e(postingFragment2);
        this.j = new d(postingFragment2, gd40Var);
        this.k = new b(postingFragment2);
        this.l = new c(postingFragment2);
        v100 v100Var = new v100(this, 23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.m = msy.a(lazyThreadSafetyMode, v100Var);
        this.n = msy.a(lazyThreadSafetyMode, new fr20(this, 20));
        this.o = msy.a(lazyThreadSafetyMode, new z260(this, 17));
        this.p = msy.a(lazyThreadSafetyMode, new w100(this, 25));
        Lazy a2 = msy.a(lazyThreadSafetyMode, new a040(this, 24));
        this.q = a2;
        this.r = new i6a0(postingFragment2, gd40Var, (g760) a2.getValue());
        this.s = new n0w0();
        this.t = new vcv0();
        this.u = new eed0(postingFragment, postingFragment2);
        new bpn0(new p6y(this, 27));
    }

    public static Context b(FragmentImpl fragmentImpl) {
        if (fragmentImpl.isAdded()) {
            return fragmentImpl.mo2getContext();
        }
        return null;
    }

    public final void a(Activity activity, boolean z, PostEditingReason postEditingReason, boolean z2) {
        Bundle bundle;
        FragmentManager supportFragmentManager;
        if (z) {
            gd40 gd40Var = this.f;
            ((ibc0) gd40Var.invoke()).h().close();
            if ((postEditingReason instanceof PostEditingReason.NewPost) || (postEditingReason instanceof PostEditingReason.EditLocalDraft)) {
                ((ibc0) gd40Var.invoke()).h().d();
            } else if (postEditingReason instanceof PostEditingReason.EditRemoteDraft) {
                ((ibc0) gd40Var.invoke()).i().b();
            }
        }
        if (z2) {
            for (String str : e43.l("closeDrafts", "closeOutherPosting")) {
                FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
                if (fragmentActivity != null && (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) != null) {
                    supportFragmentManager.k0(yfb.a(), str);
                }
            }
        }
        PostingFragment postingFragment = this.b;
        if (!postingFragment.Nn()) {
            postingFragment.finish();
            return;
        }
        Intent intent = new Intent();
        Bundle arguments = postingFragment.getArguments();
        if (arguments != null && (bundle = arguments.getBundle("SHOW_NEW_POST_BOX_DATA")) != null) {
            intent.putExtra("ownerId", bundle.getLong("ownerId", 0L));
            intent.putExtra("postId", bundle.getInt("postId", 0));
        }
        postingFragment.Mf(-1, intent);
    }

    public final void c(Date date) {
        Context b2 = b(this.b);
        if (b2 == null) {
            return;
        }
        ekc0 a2 = ((lyk) this.e.invoke()).a(R.string.postpone_publication_when_to_publish, b2);
        a2.c = new r820(this, 14);
        ckc0.c(a2, date, null, null, 6);
    }

    public final void d(Date date, h1 h1Var) {
        Context b2 = b(this.b);
        if (b2 == null) {
            return;
        }
        ekc0 a2 = ((lyk) this.e.invoke()).a(R.string.open_post_for_all, b2);
        a2.c = h1Var;
        ckc0.c(a2, date, null, null, 6);
    }
}
