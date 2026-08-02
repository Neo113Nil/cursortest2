package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.media3.exoplayer.offline.d;
import androidx.preference.Preference;
import com.vk.api.generated.audio.dto.AudioRestrictionInfoDto;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.core.apps.BuildInfo;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.music.MusicTrack;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;
import com.vk.ecomm.reviews.impl.allreviews.MarketAllReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.photos.root.presentation.e;
import com.vk.search.params.api.City;
import com.vk.search.params.impl.presentation.modal.education.mvi.model.a;
import com.vkontakte.android.R;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import ru.ok.pattern.pipeline.BodyPatternMatchingPipeline;
import ru.ok.tensorflow.entity.Detection;
import ru.ok.tensorflow.util.Function;
import xsna.c8p;
import xsna.eeu0;
import xsna.h7u0;
import xsna.hao;
import xsna.ihz;
import xsna.jza0;
import xsna.prt;
import xsna.qlh;
import xsna.ush;
import xsna.xn50;
import xsna.ykb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b9 implements io.reactivex.rxjava3.functions.l, HeightCalculatorFactory.MeasureTabHeightFn, Function, io.reactivex.rxjava3.functions.m, a0i, Preference.c, d.a, pcs, ihz.a, prt.a, io.reactivex.rxjava3.functions.c, PhotoFlowToolbarView.d {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.prt.a
    public String a(MusicTrack musicTrack) {
        return (String) ((izs) this.c).invoke(musicTrack);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        Detection lambda$matchAsync$9;
        switch (this.b) {
            case 0:
                return (List) ((a9) this.c).invoke(obj);
            case 1:
                return (AudioRestrictionInfoDto) ((qr0) this.c).invoke(obj);
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 22:
            case 23:
            default:
                return (ykb0.a) ((owv) this.c).invoke(obj);
            case 3:
                lambda$matchAsync$9 = ((BodyPatternMatchingPipeline) this.c).lambda$matchAsync$9((Detection) obj);
                return lambda$matchAsync$9;
            case 4:
                return (io.reactivex.rxjava3.core.t) ((pz) this.c).invoke(obj);
            case 5:
                return (List) ((com.vk.movika.sdk.base.observable.o) this.c).invoke(obj);
            case 6:
                return (List) ((qm) this.c).invoke(obj);
            case 7:
                return (jwk) ((qm) this.c).invoke(obj);
            case 9:
                return ((qlh.d) this.c).invoke(obj);
            case 10:
                return (ush.a) ((qm) this.c).invoke(obj);
            case 19:
                return (io.reactivex.rxjava3.core.e) ((u4e) this.c).invoke(obj);
            case 20:
                return (Boolean) ((qm) this.c).invoke(obj);
            case 24:
                return (tt70) ((sux) this.c).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.t) ((sux) this.c).invoke(obj);
            case 26:
                return (io.reactivex.rxjava3.core.t) ((owv) this.c).invoke(obj);
            case 27:
                return (nov) ((owv) this.c).invoke(obj);
        }
    }

    @Override // androidx.media3.exoplayer.offline.d.a
    public void b(long j, long j2, float f) {
        long j3;
        long j4;
        hao haoVar = (hao) this.c;
        yan yanVar = haoVar.p;
        if (yanVar != null) {
            j3 = j;
            j4 = j2;
            yanVar.c(haoVar.l.a, j3, j4);
        } else {
            j3 = j;
            j4 = j2;
        }
        haoVar.u = new hao.a(j4, j3);
    }

    @Override // xsna.a0i
    public void c(zzh zzhVar) {
        CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
        communityReviewsFragment.Q.getClass();
        com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c[] a = c0i.a(zzhVar);
        xn50.a.d(communityReviewsFragment, (kj50[]) Arrays.copyOf(a, a.length));
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        final DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) this.c;
        String[] strArr = DebugDevSettingsFragment.t0;
        o2l.a.getClass();
        final long j = BuildInfo.h() ? com.vk.core.preference.Preference.j().getLong("__dbg_apply_spaces_chat", 0L) : 0L;
        eeu0.a.C2801a c2801a = new eeu0.a.C2801a(new h7u0.a(debugDevSettingsFragment.requireContext()));
        c2801a.b = "Apply spaces for chat";
        c2801a.s = new wzs(debugDevSettingsFragment, j) { // from class: xsna.m3l
            public final /* synthetic */ long b;

            {
                this.b = j;
            }

            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                EditText editText = (EditText) obj;
                TextView textView = (TextView) obj2;
                String[] strArr2 = DebugDevSettingsFragment.t0;
                editText.setInputType(2);
                editText.setHint("Peer id");
                long j2 = this.b;
                editText.setText(j2 != 0 ? defpackage.k0.a(j2, "") : "");
                editText.addTextChangedListener(new t4l(textView));
                return null;
            }
        };
        c2801a.c(R.string.ok, new bh5(debugDevSettingsFragment, 4), true);
        c2801a.g();
        return true;
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((jza0.b) obj).k((fi20) this.c);
    }

    @Override // com.vk.content.design.view.photo.flow.PhotoFlowToolbarView.d
    public void onClick() {
        ((com.vk.photos.root.presentation.h) this.c).e.invoke(e.c.a);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 16:
                c8p.b bVar = c8p.n1;
                q7p feature = ((c8p) obj).getFeature();
                qcy<Object>[] qcyVarArr = ph.n1;
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = bundle.getParcelable("database_result", City.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable5 = bundle.getParcelable("database_result");
                    parcelable = (City) (parcelable5 instanceof City ? parcelable5 : null);
                }
                feature.C(new a.c((City) parcelable));
                break;
            default:
                MarketAllReviewsFragment marketAllReviewsFragment = (MarketAllReviewsFragment) obj;
                int i2 = MarketAllReviewsFragment.d0;
                String l = fpf0.a(CreateCommunityReviewResult.class).l();
                if (l == null) {
                    l = "";
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = bundle.getParcelable(l, CreateCommunityReviewResult.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    Parcelable parcelable6 = bundle.getParcelable(l);
                    parcelable3 = (CreateCommunityReviewResult) (parcelable6 instanceof CreateCommunityReviewResult ? parcelable6 : null);
                }
                CreateCommunityReviewResult createCommunityReviewResult = (CreateCommunityReviewResult) parcelable3;
                if (createCommunityReviewResult != null) {
                    marketAllReviewsFragment.requireView().postDelayed(new ks00(marketAllReviewsFragment, createCommunityReviewResult), 150L);
                    break;
                }
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 8:
                break;
            case 13:
                break;
        }
        return ((Boolean) ((qm) this.c).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 22:
                return (Pair) ((tg4) this.c).invoke(obj, obj2);
            default:
                return (ep20) ((id4) this.c).invoke(obj, obj2);
        }
    }
}
