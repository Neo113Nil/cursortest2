package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.NonBouncedCollapsingToolbarLayout;
import com.vk.bridges.di.BridgeComponent;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vkontakte.android.R;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsToolbarFactory.kt */
/* loaded from: classes17.dex */
public final class w9f {
    public final f5z a;
    public final View b;
    public final LayoutInflater c;
    public final a d;
    public final boolean e;
    public final mx4 f;

    /* compiled from: ClipsToolbarFactory.kt */
    public static final class a {
        public final zof a;
        public final uge b;
        public final fce c;
        public final Object d;
        public final Object e;

        public a(zof zofVar, uge ugeVar, fce fceVar, Lazy<? extends rhd> lazy, Lazy<? extends BridgeComponent> lazy2) {
            this.a = zofVar;
            this.b = ugeVar;
            this.c = fceVar;
            this.d = lazy;
            this.e = lazy2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d) && this.e.equals(aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + vul0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Dependencies(experiments=");
            sb.append(this.a);
            sb.append(", clipsInterestsLauncher=");
            sb.append(this.b);
            sb.append(", challengeDrawableFactory=");
            sb.append(this.c);
            sb.append(", clipsAuthorsPickerInteractorLazy=");
            sb.append(this.d);
            sb.append(", bridgeComponentLazy=");
            return k73.c(sb, this.e, ')');
        }
    }

    public w9f(f5z f5zVar, View view, LayoutInflater layoutInflater, a aVar, boolean z, mx4 mx4Var) {
        this.a = f5zVar;
        this.b = view;
        this.c = layoutInflater;
        this.d = aVar;
        this.e = z;
        this.f = mx4Var;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    public final sjd a(fee feeVar, ClipGridParams clipGridParams, c6f c6fVar, ree reeVar) {
        a aVar = this.d;
        ?? r6 = aVar.e;
        boolean z = clipGridParams instanceof ClipGridParams.OnlyId.Profile;
        View view = this.b;
        if (!z && !(clipGridParams instanceof ClipGridParams.Data.Profile)) {
            ((NonBouncedCollapsingToolbarLayout) view.findViewById(R.id.collapsing_layout)).addView(this.c.inflate(R.layout.clips_grid_common_toolbar, (ViewGroup) null), 0);
        }
        if (z || (clipGridParams instanceof ClipGridParams.Data.Profile)) {
            nye nyeVar = new nye(this.a, view.getContext(), feeVar.F0(), dhr0.M() || this.e, this.e);
            ((NonBouncedCollapsingToolbarLayout) view.findViewById(R.id.collapsing_layout)).addView(nyeVar.d, 0);
            ?? r62 = aVar.d;
            uge ugeVar = aVar.b;
            ClipGridParams.OnlyId zb = clipGridParams.zb();
            ClipGridParams.OnlyId.Profile profile = zb instanceof ClipGridParams.OnlyId.Profile ? (ClipGridParams.OnlyId.Profile) zb : null;
            return new ebd(this.a, view, feeVar, reeVar, r62, profile != null ? profile.b : null, c6fVar, ugeVar, nyeVar);
        }
        if ((clipGridParams instanceof ClipGridParams.Data.Music) || (clipGridParams instanceof ClipGridParams.OnlyId.Audio)) {
            return new yle(feeVar, view, reeVar, r6);
        }
        if ((clipGridParams instanceof ClipGridParams.Data.CameraMask) || (clipGridParams instanceof ClipGridParams.OnlyId.CameraMask)) {
            return new ald(feeVar, view, reeVar);
        }
        if ((clipGridParams instanceof ClipGridParams.Data.ClipCompilation) || (clipGridParams instanceof ClipGridParams.OnlyId.ClipCompilation)) {
            vnd vndVar = new vnd(feeVar, view, reeVar);
            vndVar.t = true;
            return vndVar;
        }
        if ((clipGridParams instanceof ClipGridParams.Data.Hashtag) || (clipGridParams instanceof ClipGridParams.OnlyId.Hashtag)) {
            return new afe(feeVar, view, reeVar, aVar.c, r6, this.f);
        }
        if (!(clipGridParams instanceof ClipGridParams.Data.GeoPlace) && !(clipGridParams instanceof ClipGridParams.OnlyId.GeoPlace)) {
            throw new NoWhenBranchMatchedException();
        }
        w9e w9eVar = new w9e(feeVar, view, reeVar);
        w9eVar.t = true;
        return w9eVar;
    }
}
