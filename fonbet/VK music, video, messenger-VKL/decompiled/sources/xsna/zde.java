package xsna;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.clips.design.view.component.video.preview.ClipRectanglePreview;
import com.vk.clips.playlists.ClipsPlaylistsSmallFoldersLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.libvideo.autoplay.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.PropertyReference0Impl;
import xsna.ceq0;

/* compiled from: ClipsGridOwnerClipsListAdapter.kt */
/* loaded from: classes17.dex */
public final class zde extends gd {
    public final String f;
    public final yzs<Integer, List<ClipVideoFile>, io2, s3q0> g;
    public final FunctionReferenceImpl h;
    public final FunctionReferenceImpl i;
    public final boolean j;
    public final PropertyReference0Impl k;
    public final gzs<Integer> l;
    public final f5z m;
    public final Lazy<ClipsPlaylistsComponent> n;
    public boolean o;

    /* compiled from: ClipsGridOwnerClipsListAdapter.kt */
    public static final class a extends m.e<nmv> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(nmv nmvVar, nmv nmvVar2) {
            nmv nmvVar3 = nmvVar;
            nmv nmvVar4 = nmvVar2;
            if ((nmvVar3 instanceof ClipsGridHeaderEntry.b) && (nmvVar4 instanceof ClipsGridHeaderEntry.b)) {
                return epx.f(((ClipsGridHeaderEntry.b) nmvVar3).a, ((ClipsGridHeaderEntry.b) nmvVar4).a);
            }
            if (!(nmvVar3 instanceof uee) || !(nmvVar4 instanceof uee)) {
                return false;
            }
            uee ueeVar = (uee) nmvVar3;
            uee ueeVar2 = (uee) nmvVar4;
            if (!epx.f(ueeVar.a, ueeVar2.a)) {
                return false;
            }
            ceq0 ceq0Var = ueeVar.b;
            ceq0 ceq0Var2 = ueeVar2.b;
            if (ceq0Var == null && ceq0Var2 == null) {
                return true;
            }
            if (ceq0Var == null || ceq0Var2 == null || ceq0Var.getClass() != ceq0Var2.getClass()) {
                return false;
            }
            if (!(ceq0Var instanceof ceq0.g) || !(ceq0Var2 instanceof ceq0.g)) {
                return true;
            }
            ceq0.g gVar = (ceq0.g) ceq0Var;
            ceq0.g gVar2 = (ceq0.g) ceq0Var2;
            return gVar.getProgress() == gVar2.getProgress() && gVar.e() == gVar2.e();
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            if (r0.equals(r2 != null ? java.lang.Integer.valueOf(r2.b()) : null) == true) goto L25;
         */
        @Override // androidx.recyclerview.widget.m.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean areItemsTheSame(nmv nmvVar, nmv nmvVar2) {
            nmv nmvVar3 = nmvVar;
            nmv nmvVar4 = nmvVar2;
            if (!(nmvVar3 instanceof ClipsGridHeaderEntry.b) || !(nmvVar4 instanceof ClipsGridHeaderEntry.b)) {
                if (!(nmvVar3 instanceof uee) || !(nmvVar4 instanceof uee)) {
                    return false;
                }
                uee ueeVar = (uee) nmvVar3;
                ceq0 ceq0Var = ueeVar.b;
                if (ceq0Var != null) {
                    Integer valueOf = Integer.valueOf(ceq0Var.b());
                    ceq0 ceq0Var2 = ((uee) nmvVar4).b;
                }
                int i = ueeVar.a.c;
                if (i == 0 || i != ((uee) nmvVar4).a.c) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.m.e
        public final Object getChangePayload(nmv nmvVar, nmv nmvVar2) {
            return nmvVar2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zde(String str, yzs yzsVar, wzs wzsVar, wzs wzsVar2, boolean z, PropertyReference0Impl propertyReference0Impl, gzs gzsVar, f5z f5zVar, Lazy lazy) {
        super(new a());
        this.f = str;
        this.g = yzsVar;
        this.h = (FunctionReferenceImpl) wzsVar;
        this.i = (FunctionReferenceImpl) wzsVar2;
        this.j = z;
        this.k = propertyReference0Impl;
        this.l = gzsVar;
        this.m = f5zVar;
        this.n = lazy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r2.O == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList K0() {
        ClipVideoFile clipVideoFile;
        uee ueeVar;
        ceq0 ceq0Var;
        List<nmv> y0 = y0();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) y0).iterator();
        while (it.hasNext()) {
            nmv nmvVar = (nmv) it.next();
            if ((nmvVar instanceof uee) && ((ceq0Var = (ueeVar = (uee) nmvVar).b) == null || (ceq0Var instanceof ceq0.e))) {
                clipVideoFile = ueeVar.a;
            }
            clipVideoFile = null;
            if (clipVideoFile != null) {
                arrayList.add(clipVideoFile);
            }
        }
        return arrayList;
    }

    @Override // xsna.mmv
    public final boolean N(int i) {
        return i >= 0 && i < getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return ((nmv) this.c.c(i)) instanceof ClipsGridHeaderEntry.b ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ca, code lost:
    
        if (r8 == null) goto L97;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        int i2;
        Image image;
        ClipRectanglePreview.PreviewItem.c cVar;
        String str;
        int i3;
        gko gkoVar;
        boolean z = e0Var instanceof vde;
        uuk uukVar = this.c;
        if (!z) {
            if (e0Var instanceof aee) {
                ((aee) e0Var).V5((ClipsGridHeaderEntry.b) uukVar.c(i));
                return;
            }
            return;
        }
        vde vdeVar = (vde) e0Var;
        uee ueeVar = (uee) uukVar.c(i);
        ClipVideoFile clipVideoFile = ueeVar.a;
        ceq0 ceq0Var = ueeVar.b;
        vdeVar.p = ueeVar;
        VideoRestriction videoRestriction = clipVideoFile.O0;
        if (videoRestriction == null || videoRestriction.f) {
            int i4 = emf.a;
            if (clipVideoFile.r <= 0 && (ceq0Var == null || !ceq0Var.f())) {
                h270 h270Var = (h270) vdeVar.o.getValue();
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                h270Var.k(clipVideoFile, b.C1208b.a().e(clipVideoFile, null), com.vk.libvideo.autoplay.a.t);
                g620.f().s(clipVideoFile, vdeVar.l, clipVideoFile.W);
            }
        }
        View view = vdeVar.itemView;
        dee deeVar = view instanceof dee ? (dee) view : null;
        if (deeVar != null) {
            String a2 = ceq0Var != null ? ceq0Var.a() : null;
            deeVar.getClipPreview().setEndTopIcon(g620.f().getPrivacy().d(clipVideoFile) ? new ClipRectanglePreview.PreviewItem.Icon(new gko(R.drawable.vk_icon_lock_12), new x7g(R.attr.vk_ui_icon_contrast), null, 58) : null);
            if (a2 != null) {
                i2 = R.attr.vk_ui_icon_contrast;
                image = new Image((List<ImageSize>) Collections.singletonList(new ImageSize(a2, 1, 1, null, (char) 0, false, 56, null)));
            } else {
                i2 = R.attr.vk_ui_icon_contrast;
                image = clipVideoFile.I0;
            }
            deeVar.b(image, (clipVideoFile.r == 0 && (ceq0Var == null || (ceq0Var instanceof ceq0.e))) ? Integer.valueOf(clipVideoFile.s) : null, false, null, null, false);
            boolean z2 = (ceq0Var != null && ceq0Var.e()) || (clipVideoFile.O && ceq0Var == null) || clipVideoFile.r > 0;
            if (z2) {
                deeVar.getClipPreview().setMainIcon(new ClipRectanglePreview.PreviewItem.Icon(new gko(R.drawable.vk_icon_clock_outline_28), new x7g(i2), null, 58));
            } else {
                deeVar.getClipPreview().setMainIcon(null);
            }
            boolean z3 = (z2 || (ceq0Var instanceof ceq0.e) || ceq0Var == null) ? false : true;
            ClipRectanglePreview clipPreview = deeVar.getClipPreview();
            if (z3) {
                if (ceq0Var instanceof ceq0.g) {
                    i3 = ((ceq0.g) ceq0Var).getProgress();
                } else {
                    if (!(ceq0Var instanceof ceq0.c)) {
                        boolean z4 = ceq0Var instanceof ceq0.f;
                    }
                    i3 = 1;
                }
                boolean z5 = ceq0Var != null && ceq0Var.d();
                if (ceq0Var instanceof ceq0.e) {
                    gkoVar = null;
                } else {
                    gkoVar = new gko(z5 ? R.drawable.vk_icon_replay_24 : R.drawable.vk_icon_cancel_16);
                }
                cVar = new ClipRectanglePreview.PreviewItem.c(i3, gkoVar, new x7g(i2), null, new x7g(i2), tq.h(tlo0.Companion, z5 ? R.string.clips_accessibility_retry_upload : R.string.clips_accessibility_cancel_upload), new com.vk.catalog2.common.ui.holders.b(5, ceq0Var, deeVar), 8);
            } else {
                cVar = null;
            }
            clipPreview.setMainActionUpload(cVar);
            ClipRectanglePreview clipPreview2 = deeVar.getClipPreview();
            int i5 = clipVideoFile.r;
            Integer valueOf = Integer.valueOf(i5);
            if (i5 <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                str = pvo0.i(false, valueOf.intValue(), false, true);
                if (str.length() > 0) {
                    str = ((Object) String.valueOf(str.charAt(0)).toUpperCase(Locale.ROOT)) + str.substring(1);
                }
            }
            str = "";
            if (ceq0Var != null) {
                if ((ceq0Var instanceof ceq0.c) || (ceq0Var instanceof ceq0.d)) {
                    str = deeVar.getContext().getString(R.string.clip_upload_canceled);
                } else if (ceq0Var instanceof ceq0.h) {
                    str = deeVar.getContext().getString(R.string.clip_upload_soon);
                } else if (ceq0Var instanceof ceq0.f) {
                    str = deeVar.getContext().getString(R.string.clip_upload_error);
                } else if (!(ceq0Var instanceof ceq0.e)) {
                    if ((ceq0Var instanceof ceq0.b) || (ceq0Var instanceof ceq0.a)) {
                        str = deeVar.getContext().getString(R.string.clip_upload_processing_v2);
                    } else {
                        if (!(ceq0Var instanceof ceq0.g)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = deeVar.getContext().getString(R.string.clip_upload_progress_v2, Integer.valueOf(((ceq0.g) ceq0Var).getProgress()));
                    }
                }
            } else if (clipVideoFile.O) {
                str = deeVar.getContext().getString(R.string.clip_upload_processing_v2);
            } else if (clipVideoFile.r <= 0) {
                str = null;
            }
            if (str == null || str.length() <= 0) {
                str = null;
            }
            clipPreview2.setPrimaryLabel(str != null ? new ClipRectanglePreview.PreviewItem.b(oq.d(tlo0.Companion, str), 1, new x7g(R.attr.vk_ui_text_contrast), null, null, 248) : null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new vde(viewGroup, this.f, new yde(this, 0), new s9(this, 25));
        }
        return this.n.getValue().S0().a(viewGroup.getContext(), new ClipsPlaylistsSmallFoldersLaunchParams((UserId) this.k.get(), true, this.j, null, 0, 24, null), new kbe(this, 2), this.m, new m1(this, 28));
    }

    @Override // xsna.zoj0, xsna.uuk
    public final void setItems(List<? extends nmv> list) {
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (nmv nmvVar : list) {
                if (this.o && (nmvVar instanceof ClipsGridHeaderEntry.b)) {
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
        if (((nmv) this.c.c(i)) instanceof ClipsGridHeaderEntry.b) {
            return this.e;
        }
        return 1;
    }
}
