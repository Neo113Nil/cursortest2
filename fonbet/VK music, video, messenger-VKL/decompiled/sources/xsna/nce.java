package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.common.links.LinksParserData;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsChallenge;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ede;
import xsna.gde;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: ClipsGridCommonClipsListAdapter.kt */
/* loaded from: classes17.dex */
public final class nce extends gd {
    public final b f;
    public final FunctionReferenceImpl g;
    public final wzs<ClipGridParams.Data, ClipCameraParams, s3q0> h;
    public final izs<ClipsGridHeaderEntry.Author, s3q0> i;
    public final gzs<Integer> j;
    public final f5z k;
    public final zof l;
    public final ClipsPlaylistsComponent m;
    public boolean n;

    /* compiled from: ClipsGridCommonClipsListAdapter.kt */
    public static final class a extends m.e<nmv> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(nmv nmvVar, nmv nmvVar2) {
            nmv nmvVar3 = nmvVar;
            nmv nmvVar4 = nmvVar2;
            if (nmvVar3 instanceof ClipsGridHeaderEntry.c) {
                return nmvVar4 instanceof ClipsGridHeaderEntry.c;
            }
            if (nmvVar3 instanceof ClipsGridHeaderEntry.a) {
                if (!(nmvVar4 instanceof ClipsGridHeaderEntry.a) || !epx.f(((ClipsGridHeaderEntry.a) nmvVar3).a, ((ClipsGridHeaderEntry.a) nmvVar4).a)) {
                    return false;
                }
            } else if (nmvVar3 instanceof ClipsGridHeaderEntry.Author) {
                if (!(nmvVar4 instanceof ClipsGridHeaderEntry.Author)) {
                    return false;
                }
                ClipsGridHeaderEntry.Author author = (ClipsGridHeaderEntry.Author) nmvVar3;
                ClipsGridHeaderEntry.Author author2 = (ClipsGridHeaderEntry.Author) nmvVar4;
                if (!epx.f(author.b, author2.b) || author.d != author2.d || author.e != author2.e) {
                    return false;
                }
            } else {
                if (!(nmvVar3 instanceof ClipsGridHeaderEntry.b)) {
                    if ((nmvVar3 instanceof gce) || (nmvVar3 instanceof vee)) {
                        return nmvVar3.equals(nmvVar4);
                    }
                    return false;
                }
                if (!(nmvVar4 instanceof ClipsGridHeaderEntry.b) || !epx.f(((ClipsGridHeaderEntry.b) nmvVar3).a, ((ClipsGridHeaderEntry.b) nmvVar4).a)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(nmv nmvVar, nmv nmvVar2) {
            nmv nmvVar3 = nmvVar;
            nmv nmvVar4 = nmvVar2;
            return nmvVar3 instanceof ClipsGridHeaderEntry.c ? nmvVar4 instanceof ClipsGridHeaderEntry.c : nmvVar3 instanceof ClipsGridHeaderEntry.a ? (nmvVar4 instanceof ClipsGridHeaderEntry.a) && epx.f(((ClipsGridHeaderEntry.a) nmvVar3).a, ((ClipsGridHeaderEntry.a) nmvVar4).a) : nmvVar3 instanceof ClipsGridHeaderEntry.Author ? (nmvVar4 instanceof ClipsGridHeaderEntry.Author) && epx.f(((ClipsGridHeaderEntry.Author) nmvVar3).a, ((ClipsGridHeaderEntry.Author) nmvVar4).a) : nmvVar3 instanceof gce ? nmvVar4 instanceof gce : nmvVar3 instanceof vee ? (nmvVar4 instanceof vee) && ((vee) nmvVar3).a.c == ((vee) nmvVar4).a.c : nmvVar3 instanceof ClipsGridHeaderEntry.b ? nmvVar4 instanceof ClipsGridHeaderEntry.b : nmvVar3.equals(nmvVar4);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(nmv nmvVar, nmv nmvVar2) {
            return nmvVar2;
        }
    }

    /* compiled from: ClipsGridCommonClipsListAdapter.kt */
    public static final class b {
        public final String a;
        public final boolean b;
        public final UserId c;

        public b(UserId userId, String str, boolean z) {
            this.a = str;
            this.b = z;
            this.c = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return Long.hashCode(this.c.b) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(ref=");
            sb.append(this.a);
            sb.append(", isForceDark=");
            sb.append(this.b);
            sb.append(", ownerId=");
            return gp.b(sb, this.c, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nce(b bVar, wzs<? super Integer, ? super io2, s3q0> wzsVar, wzs<? super ClipGridParams.Data, ? super ClipCameraParams, s3q0> wzsVar2, izs<? super ClipsGridHeaderEntry.Author, s3q0> izsVar, gzs<Integer> gzsVar, f5z f5zVar, zof zofVar, ClipsPlaylistsComponent clipsPlaylistsComponent) {
        super(new a());
        this.f = bVar;
        this.g = (FunctionReferenceImpl) wzsVar;
        this.h = wzsVar2;
        this.i = izsVar;
        this.j = gzsVar;
        this.k = f5zVar;
        this.l = zofVar;
        this.m = clipsPlaylistsComponent;
    }

    @Override // xsna.mmv
    public final boolean N(int i) {
        return i >= 0 && i < getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        nmv nmvVar = (nmv) this.c.c(i);
        if (nmvVar instanceof ClipsGridHeaderEntry.c) {
            return 0;
        }
        if (nmvVar instanceof ClipsGridHeaderEntry.a) {
            return 1;
        }
        if (nmvVar instanceof ClipsGridHeaderEntry.Author) {
            return 2;
        }
        if (nmvVar instanceof ClipsGridHeaderEntry.b) {
            return 5;
        }
        return nmvVar instanceof gce ? 3 : 4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        onBindViewHolder(e0Var, i, Collections.EMPTY_LIST);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new hde(viewGroup);
        }
        if (i == 1) {
            return new gde(viewGroup);
        }
        if (i == 2) {
            return new ede(viewGroup, this.i);
        }
        if (i == 3) {
            return new hce(viewGroup, this.h);
        }
        b bVar = this.f;
        if (i == 4) {
            return new lce(viewGroup, bVar.a, this.g);
        }
        if (i != 5) {
            throw new IllegalStateException(lhg.a(i, "Unsupported view type: "));
        }
        return this.m.S0().a(viewGroup.getContext(), new ClipsPlaylistsSmallFoldersLaunchParams(bVar.c, false, bVar.b, null, 0, 24, null), new com.vk.movika.sdk.base.model.e(this, 20), this.k, new bb(this, 19));
    }

    @Override // xsna.zoj0, xsna.uuk
    public final void setItems(List<? extends nmv> list) {
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (nmv nmvVar : list) {
                if (this.n && (nmvVar instanceof ClipsGridHeaderEntry.b)) {
                    nmvVar = null;
                }
                if (nmvVar != null) {
                    arrayList2.add(nmvVar);
                }
            }
            arrayList = arrayList2;
        }
        super.setItems(arrayList);
    }

    @Override // xsna.mmv
    public final int v(int i) {
        if (((nmv) this.c.c(i)) instanceof vee) {
            return 1;
        }
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<? extends Object> list) {
        String str;
        Drawable d;
        int i2;
        int i3;
        nmv nmvVar = (nmv) this.c.c(i);
        VkMiniInfoCell.e eVar = null;
        if (e0Var instanceof lce) {
            lce lceVar = (lce) e0Var;
            if (nmvVar instanceof vee) {
                pkd f = g620.f();
                vee veeVar = (vee) nmvVar;
                ClipVideoFile clipVideoFile = veeVar.a;
                f.s(clipVideoFile, lceVar.l, clipVideoFile.W);
                h270 h270Var = lceVar.n;
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                h270Var.k(clipVideoFile, b.C1208b.a().e(clipVideoFile, null), com.vk.libvideo.autoplay.a.t);
                View view = lceVar.itemView;
                boolean z = view instanceof dee;
                if (z) {
                    dee deeVar = z ? (dee) view : null;
                    if (deeVar != null) {
                        deeVar.b(clipVideoFile.I0, veeVar.f ? null : Integer.valueOf(clipVideoFile.s), veeVar.c, veeVar.d, veeVar.e ? clipVideoFile.p0 : null, false);
                        kce kceVar = new kce(clipVideoFile.O0 != null, lceVar, veeVar);
                        VideoOverlayView videoOverlayView = deeVar.e;
                        if (videoOverlayView != null) {
                            kceVar.invoke(videoOverlayView);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (e0Var instanceof hde) {
            hde hdeVar = (hde) e0Var;
            if (nmvVar instanceof ClipsGridHeaderEntry.c) {
                VkText vkText = hdeVar.l;
                ((ClipsGridHeaderEntry.c) nmvVar).getClass();
                vkText.setText((CharSequence) null);
                return;
            } else {
                String a2 = qjg.a(hdeVar);
                StringBuilder sb = new StringBuilder("bind wrong data for header (expected ClipGridHeaderEntry.Text, got ");
                sb.append(nmvVar != null ? qjg.a(nmvVar) : null);
                sb.append(')');
                Log.e(a2, sb.toString());
                return;
            }
        }
        if (e0Var instanceof gde) {
            gde gdeVar = (gde) e0Var;
            VkCell vkCell = gdeVar.p;
            if (!(nmvVar instanceof ClipsGridHeaderEntry.a)) {
                String a3 = qjg.a(gdeVar);
                StringBuilder sb2 = new StringBuilder("bind wrong data for header (expected ClipGridHeaderEntry.Music, got ");
                sb2.append(nmvVar != null ? qjg.a(nmvVar) : null);
                sb2.append(')');
                Log.e(a3, sb2.toString());
                return;
            }
            vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.d(new gde.b(R.drawable.vk_icon_play_24), VkCell.Left.Main.Size.Small), null));
            MusicTrack musicTrack = gdeVar.t;
            MusicTrack musicTrack2 = ((ClipsGridHeaderEntry.a) nmvVar).a;
            r5 = musicTrack != null && musicTrack.B();
            boolean B = musicTrack2.B();
            List<Artist> list2 = musicTrack2.u;
            if (r5 != B) {
                float f2 = musicTrack2.B() ? 0.5f : 1.0f;
                ViewGroup viewGroup = (ViewGroup) gdeVar.itemView;
                for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                    viewGroup.getChildAt(i4).setAlpha(f2);
                }
            }
            gdeVar.t = musicTrack2;
            tlo0.a aVar = tlo0.Companion;
            Context context = vkCell.getContext();
            ucp ucpVar = ucp.a;
            CharSequence p0 = drm0.p0(ucp.i(musicTrack2.d));
            StringBuilder sb3 = new StringBuilder();
            String str2 = musicTrack2.e;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            sb3.append(str2);
            sb3.append(' ');
            sb3.append(s490.c(list2));
            tlo0.h f3 = u11.f(aVar, s490.d(context, p0, drm0.p0(sb3.toString()).toString(), R.attr.vk_ui_text_secondary));
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            VkCell.Middle.e eVar2 = new VkCell.Middle.e(f3, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50);
            StringBuilder sb4 = new StringBuilder();
            List<Artist> list3 = musicTrack2.t;
            if (list3 != null) {
                str3 = s490.i(list3);
            } else {
                String str4 = musicTrack2.h;
                if (str4 != null) {
                    str3 = str4;
                }
            }
            sb4.append(str3);
            sb4.append(' ');
            sb4.append(s490.c(list2));
            vkCell.setMiddle(new VkCell.Middle.b(eVar2, new VkCell.Middle.d(new tlo0.h(ucp.i(drm0.p0(sb4.toString()).toString())), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
            VkCell.Right.d right = vkCell.getRight();
            vkCell.setRight(VkCell.Right.d.a(right == null ? new VkCell.Right.d((VkCell.Right.a) null, (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 31) : right, null, null, new VkCell.Right.ExtraAction.d(new q(gdeVar, 23), new tlo0.f(R.string.common_actions), new k1u0.a(new x7g(R.attr.vk_ui_icon_accent_themed))), null, null, 27));
            return;
        }
        if (!(e0Var instanceof ede)) {
            if (!(e0Var instanceof hce)) {
                if (e0Var instanceof aee) {
                    ((aee) e0Var).V5(nmvVar);
                    return;
                }
                return;
            }
            hce hceVar = (hce) e0Var;
            if (!(nmvVar instanceof gce)) {
                Log.e(qjg.a(hceVar), "bind wrong data for clip entry (expected ClipGridChallengeEntry, got " + qjg.a(nmvVar) + ')');
                return;
            }
            gce gceVar = (gce) nmvVar;
            hceVar.m = gceVar;
            ClipGridParams.Data data = gceVar.b;
            ClipGridParams.Data.Hashtag hashtag = data instanceof ClipGridParams.Data.Hashtag ? (ClipGridParams.Data.Hashtag) data : null;
            bwt0.p0(hceVar.o, ((hashtag != null && hashtag.d) == true || (str = gceVar.a.b) == null || str.length() == 0) ? false : true);
            VkMiniInfoCell vkMiniInfoCell = hceVar.p;
            if (gceVar.a.l.isEmpty() && (cqm0.a(gceVar.a.k) == null || cqm0.a(gceVar.a.j) == null)) {
                r5 = false;
            }
            bwt0.p0(vkMiniInfoCell, r5);
            VkMiniInfoCell vkMiniInfoCell2 = hceVar.o;
            if (bwt0.K(vkMiniInfoCell2)) {
                tlo0.a aVar2 = tlo0.Companion;
                ucp ucpVar2 = ucp.a;
                sdz a4 = xwk.d().a();
                ClipsChallenge clipsChallenge = gceVar.a;
                String str5 = clipsChallenge.b;
                ClipCameraParams clipCameraParams = clipsChallenge.d;
                String str6 = clipCameraParams != null ? clipCameraParams.b : null;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(xwk.d().d());
                sb5.append("://");
                CharSequence i5 = ucp.i(drm0.p0(a4.d(str5, new LinksParserData(779, (Bundle) null, 0, 0, str6, i5s.a(sb5, a0a.d, "/clips/hashtag/"), 0, 0, (LinksParserData.HashtagService) null, (saz) new c7(hceVar, 15), 0, (taz) null, false, 15310))));
                aVar2.getClass();
                eVar = new VkMiniInfoCell.e(new tlo0.h(i5), true, false, false, false, new VkMiniInfoCell.c(new VkExpandableText.a(new tlo0.f(R.string.clips_grid_challenge_more_info_details), new x7g(R.attr.vk_ui_text_subhead), null, null, 28), 10), 28);
            }
            vkMiniInfoCell2.setMiddle(eVar);
            f4m.q(bwt0.K(hceVar.o) ? cn70.b(12) : cn70.b(0), hceVar.itemView);
            return;
        }
        ede edeVar = (ede) e0Var;
        if (!(nmvVar instanceof ClipsGridHeaderEntry.Author)) {
            String a5 = qjg.a(edeVar);
            StringBuilder sb6 = new StringBuilder("bind wrong data for header (expected ClipGridHeaderEntry.Author, got ");
            sb6.append(nmvVar != null ? qjg.a(nmvVar) : null);
            sb6.append(')');
            Log.e(a5, sb6.toString());
            return;
        }
        dde ddeVar = edeVar.m;
        ClipsGridHeaderEntry.Author author = (ClipsGridHeaderEntry.Author) nmvVar;
        ddeVar.setAvatarUrl(author.c);
        VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
        d = VerifyInfoHelper.a.d(ddeVar.getContext(), true, author.f, (r14 & 8) != 0 ? false : false, (r14 & 16) != 0, (r14 & 32) != 0 ? false : false);
        ddeVar.setVerifiedAuthor(Boolean.valueOf(d != null));
        ddeVar.setTitle(author.b);
        Context context2 = ddeVar.getContext();
        int i6 = ede.a.$EnumSwitchMapping$0[author.e.ordinal()];
        int i7 = 4;
        if (i6 == 1) {
            i2 = R.string.clips_grid_mask_owner;
        } else if (i6 == 2) {
            i2 = R.string.clips_grid_effect_owner;
        } else if (i6 == 3) {
            i2 = R.string.clips_grid_hashtag_owner;
        } else {
            if (i6 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = R.string.clips_grid_compilation_owner;
        }
        ddeVar.setDescription(context2.getString(i2));
        Object[] objArr = author.a.b > 0 ? 1 : null;
        boolean z2 = author.d;
        if (objArr != null && !z2) {
            i3 = R.drawable.vk_icon_user_add_outline_24;
        } else if (objArr != null && z2) {
            i3 = R.drawable.vk_icon_user_added_outline_24;
        } else if (objArr == null && !z2) {
            i3 = R.drawable.vk_icon_add_square_outline_28;
        } else {
            if (objArr != null || !z2) {
                throw new AssertionError("unreachable");
            }
            i3 = R.drawable.vk_icon_done_24;
        }
        ddeVar.setSubscriptionIcon(Integer.valueOf(i3));
        ddeVar.setSubscribed(author.d);
        ClipsGridHeaderEntry.Author author2 = (ClipsGridHeaderEntry.Author) nmvVar;
        ddeVar.setOnCellClicked(new g4(9, edeVar, author2));
        ddeVar.setOnSubscribeClicked(new h4(i7, edeVar, author2));
    }
}
