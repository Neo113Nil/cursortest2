package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.music.player.PlayState;
import com.vk.music.player.e;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerState;
import com.vk.newsfeed.posting.music_picker.domain.model.SnippetOnboardingState;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerArguments;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.newsfeed.posting.music_picker.presentation.model.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.k840;
import xsna.lr40;
import xsna.mk50;
import xsna.tzp0;
import xsna.xn50;

/* compiled from: MusicPickerModalBottomSheet.kt */
/* loaded from: classes4.dex */
public final class rt40 extends tl50<qs40, xu40, lr40> {
    public static final tzp0.c.a s1 = new tzp0.c.a(new b(), false);
    public ru40 k1;
    public UserId l1;
    public ms40 m1;
    public nrl p1;
    public final f4z i1 = new f4z();
    public final io.reactivex.rxjava3.disposables.b j1 = new io.reactivex.rxjava3.disposables.b();
    public final tg50 n1 = new tg50();
    public final acw0 o1 = new acw0(new lw20(this, 7));
    public final u2b0 q1 = k840.a.g().b();
    public final c r1 = new c();

    /* compiled from: MusicPickerModalBottomSheet.kt */
    public static final class b implements m0q0 {
        @Override // xsna.m0q0
        public final void y(UiTrackingScreen uiTrackingScreen) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_ATTACH_MUSIC;
        }
    }

    /* compiled from: MusicPickerModalBottomSheet.kt */
    public static final class c extends e.a {

        /* compiled from: MusicPickerModalBottomSheet.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayState.values().length];
                try {
                    iArr[PlayState.PLAYING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayState.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        @Override // com.vk.music.player.e.a, com.vk.music.player.e
        public final void N3(PlayState playState, com.vk.music.player.f fVar) {
            rt40 rt40Var = rt40.this;
            u2b0 u2b0Var = rt40Var.q1;
            int i = a.$EnumSwitchMapping$0[u2b0Var.m0().ordinal()];
            MusicPickerListItem.MusicTrackItem.PlayingState playingState = i != 1 ? i != 2 ? MusicPickerListItem.MusicTrackItem.PlayingState.None : MusicPickerListItem.MusicTrackItem.PlayingState.Paused : MusicPickerListItem.MusicTrackItem.PlayingState.Playing;
            rt40Var.getFeature().C(new zr40(u2b0Var.b(), playingState));
            rt40Var.n1.c(new llk(u2b0Var.b(), playingState));
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        Context requireContext = requireContext();
        nrl nrlVar = new nrl(requireContext, this.o1, new ot40());
        this.p1 = nrlVar;
        b.C1432b c1432b = b.C1432b.a;
        boolean d = nrlVar.d();
        ms40 ms40Var = new ms40(c1432b, this.n1, requireContext, this, new uw3(28), new tzv(this, 13), d);
        this.m1 = ms40Var;
        return new mk50.c(ms40Var.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        xu40 xu40Var = (xu40) ao50Var;
        ms40 ms40Var = this.m1;
        if (ms40Var != null) {
            ms40Var.f(xu40Var, new sec(1, this, rt40.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 5));
        }
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((qs40) vk50Var).f.a(new mgz(this, 10), this);
    }

    @Override // xsna.dw20
    public final boolean a0() {
        xn50.a.c(this, rr40.b);
        return true;
    }

    @Override // xsna.tl50, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q1.P0(this.r1, true);
        xn50.a.c(this, ks40.b);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.j1.e();
        nrl nrlVar = this.p1;
        if (nrlVar != null) {
            nrlVar.onDetachedFromWindow();
        }
        this.p1 = null;
        this.q1.n0(this.r1);
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        MusicPickerArguments musicPickerArguments;
        UserId userId;
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("music_picker_arguments", MusicPickerArguments.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("music_picker_arguments");
                if (!(parcelable3 instanceof MusicPickerArguments)) {
                    parcelable3 = null;
                }
                parcelable = (MusicPickerArguments) parcelable3;
            }
            MusicPickerArguments musicPickerArguments2 = (MusicPickerArguments) parcelable;
            if (musicPickerArguments2 != null) {
                musicPickerArguments = musicPickerArguments2;
                userId = this.l1;
                if (userId == null) {
                    userId = o25.a().c();
                }
                UserId userId2 = userId;
                new bx0(0, this, rt40.class, "getPlayingState", "getPlayingState()Lkotlin/Pair;", 0, 1);
                com.vk.newsfeed.posting.music_picker.presentation.model.a aVar = new com.vk.newsfeed.posting.music_picker.presentation.model.a();
                int i = musicPickerArguments.c;
                PickerTechMetrics pickerTechMetrics = new PickerTechMetrics(musicPickerArguments.b, null, null);
                List<MusicDto> list = musicPickerArguments.d;
                MusicDto musicDto = musicPickerArguments.e;
                boolean z = musicPickerArguments.f;
                List singletonList = Collections.singletonList(new MusicPickerList.Tracks(null, null, null, null, 0, 0, false, 127, null));
                MusicPickerListItem.MusicTrackItem.PlayingState playingState = MusicPickerListItem.MusicTrackItem.PlayingState.None;
                boolean z2 = musicPickerArguments.g;
                String str = musicPickerArguments.h;
                return new qs40(new qu40(aVar, new MusicPickerState(pickerTechMetrics, i, list, musicDto, list, musicDto, z, userId2, singletonList, playingState, null, false, z2, str, (str != null || str.length() == 0) ? SnippetOnboardingState.UNAVAILABLE : SnippetOnboardingState.BOTTOM_SHEET), new wu40(musicPickerArguments.f)), new lr40.b(userId2), this.i1, new k7y(this, 15));
            }
        }
        musicPickerArguments = new MusicPickerArguments(SystemClock.elapsedRealtime(), 1, EmptyList.b, null, false, false, null);
        userId = this.l1;
        if (userId == null) {
        }
        UserId userId22 = userId;
        new bx0(0, this, rt40.class, "getPlayingState", "getPlayingState()Lkotlin/Pair;", 0, 1);
        com.vk.newsfeed.posting.music_picker.presentation.model.a aVar2 = new com.vk.newsfeed.posting.music_picker.presentation.model.a();
        int i2 = musicPickerArguments.c;
        PickerTechMetrics pickerTechMetrics2 = new PickerTechMetrics(musicPickerArguments.b, null, null);
        List<MusicDto> list2 = musicPickerArguments.d;
        MusicDto musicDto2 = musicPickerArguments.e;
        boolean z3 = musicPickerArguments.f;
        List singletonList2 = Collections.singletonList(new MusicPickerList.Tracks(null, null, null, null, 0, 0, false, 127, null));
        MusicPickerListItem.MusicTrackItem.PlayingState playingState2 = MusicPickerListItem.MusicTrackItem.PlayingState.None;
        boolean z22 = musicPickerArguments.g;
        String str2 = musicPickerArguments.h;
        return new qs40(new qu40(aVar2, new MusicPickerState(pickerTechMetrics2, i2, list2, musicDto2, list2, musicDto2, z3, userId22, singletonList2, playingState2, null, false, z22, str2, (str2 != null || str2.length() == 0) ? SnippetOnboardingState.UNAVAILABLE : SnippetOnboardingState.BOTTOM_SHEET), new wu40(musicPickerArguments.f)), new lr40.b(userId22), this.i1, new k7y(this, 15));
    }

    /* compiled from: MusicPickerModalBottomSheet.kt */
    public static final class a extends kmu0 {
        public final C3631a h;

        /* compiled from: MusicPickerModalBottomSheet.kt */
        /* renamed from: xsna.rt40$a$a, reason: collision with other inner class name */
        public static final class C3631a {
            public final UserId a;
            public final ru40 b;
            public final long c;
            public final int d;
            public final List<MusicDto> e;
            public final MusicDto f;
            public final boolean g;
            public final boolean h;
            public final String i;

            public C3631a(UserId userId, ru40 ru40Var, long j, int i, List<MusicDto> list, MusicDto musicDto, boolean z, boolean z2, String str) {
                this.a = userId;
                this.b = ru40Var;
                this.c = j;
                this.d = i;
                this.e = list;
                this.f = musicDto;
                this.g = z;
                this.h = z2;
                this.i = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3631a)) {
                    return false;
                }
                C3631a c3631a = (C3631a) obj;
                return epx.f(this.a, c3631a.a) && epx.f(this.b, c3631a.b) && this.c == c3631a.c && this.d == c3631a.d && epx.f(this.e, c3631a.e) && epx.f(this.f, c3631a.f) && this.g == c3631a.g && this.h == c3631a.h && epx.f(this.i, c3631a.i);
            }

            public final int hashCode() {
                UserId userId = this.a;
                int a = fw3.a(shy.a(this.d, bh10.a((this.b.hashCode() + ((userId == null ? 0 : Long.hashCode(userId.b)) * 31)) * 31, 31, this.c), 31), 31, this.e);
                MusicDto musicDto = this.f;
                int b = qoy.b(qoy.b((a + (musicDto == null ? 0 : musicDto.hashCode())) * 31, 31, this.g), 31, this.h);
                String str = this.i;
                return b + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Params(musicOwnerIdOverride=");
                sb.append(this.a);
                sb.append(", callback=");
                sb.append(this.b);
                sb.append(", startScreenElapsedTime=");
                sb.append(this.c);
                sb.append(", audioMaxCount=");
                sb.append(this.d);
                sb.append(", selectedTracks=");
                sb.append(this.e);
                sb.append(", selectedPlaylist=");
                sb.append(this.f);
                sb.append(", isMultiSelectEnabled=");
                sb.append(this.g);
                sb.append(", isSnippetPreferred=");
                sb.append(this.h);
                sb.append(", snippetOnboardingTitle=");
                return ho8.a(sb, this.i, ')');
            }
        }

        public a(Context context, C3631a c3631a) {
            super(context, rt40.s1);
            this.h = c3631a;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c(new ts90(1.0f, 2));
            F0(true);
            x(0);
            m(R.attr.vk_ui_background_modal);
            R0(false);
            q0(false);
            this.d.C1 = true;
            p(true);
            O();
            rt40 rt40Var = new rt40();
            n(new b(rt40Var));
            C3631a c3631a = this.h;
            rt40Var.setArguments(yfb.b(new Pair("music_picker_arguments", new MusicPickerArguments(c3631a.c, c3631a.d, c3631a.e, c3631a.f, c3631a.g, c3631a.h, c3631a.i))));
            rt40Var.l1 = c3631a.a;
            rt40Var.k1 = c3631a.b;
            return rt40Var;
        }

        /* compiled from: MusicPickerModalBottomSheet.kt */
        public static final class b extends ModalBottomSheetBehavior.d {
            public final /* synthetic */ rt40 a;

            public b(rt40 rt40Var) {
                this.a = rt40Var;
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void b(int i, View view) {
                if (i == 5) {
                    xn50.a.c(this.a, js40.b);
                }
            }

            @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.d
            public final void a(View view, float f) {
            }
        }
    }
}
