package one.video.controls.dialogs.videotracks;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.x;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import one.video.player.f;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import xsna.asp;
import xsna.g9m;
import xsna.gk6;
import xsna.hk0;
import xsna.k9q0;
import xsna.l9p0;
import xsna.m37;
import xsna.mk80;
import xsna.nk80;
import xsna.nlt0;
import xsna.ok80;
import xsna.qwm;
import xsna.rcq;
import xsna.rwm;
import xsna.tlt0;
import xsna.xk80;
import xsna.xtt0;
import xsna.zrp;

/* compiled from: ExtendedVideoTracksDialog.kt */
/* loaded from: classes8.dex */
public final class ExtendedVideoTracksDialog extends gk6<xtt0, a> {
    public final c A;
    public final d B;
    public final l9p0 w;
    public final rwm x;
    public final int y;
    public tlt0 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ExtendedVideoTracksDialog.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type AUTO;
        public static final Type HIGH;
        public static final Type LOW;
        public static final Type OTHER;
        public static final Type TOP;

        static {
            Type type = new Type("TOP", 0);
            TOP = type;
            Type type2 = new Type("AUTO", 1);
            AUTO = type2;
            Type type3 = new Type("HIGH", 2);
            HIGH = type3;
            Type type4 = new Type("LOW", 3);
            LOW = type4;
            Type type5 = new Type(NativeAdContent.ViewTag.OTHER, 4);
            OTHER = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: ExtendedVideoTracksDialog.kt */
    public static final class a extends g9m.a {
        public final Type c;
        public final boolean d;

        /* compiled from: ExtendedVideoTracksDialog.kt */
        /* renamed from: one.video.controls.dialogs.videotracks.ExtendedVideoTracksDialog$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2175a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.AUTO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.HIGH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Type.LOW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Type.OTHER.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public a(Type type, boolean z) {
            super(type.ordinal(), true);
            this.c = type;
            this.d = z;
        }

        @Override // xsna.g9m.a
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.d == aVar.d;
        }

        @Override // xsna.g9m.a
        public final int hashCode() {
            return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "Item(type=" + this.c + ", selected=" + this.d + ")";
        }
    }

    /* compiled from: ExtendedVideoTracksDialog.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.AUTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Type.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ExtendedVideoTracksDialog.kt */
    public static final class c implements m37<xtt0, a> {
        public final /* synthetic */ Context b;
        public final /* synthetic */ OneVideoPlayer c;

        /* compiled from: ExtendedVideoTracksDialog.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.values().length];
                try {
                    iArr[Type.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Type.OTHER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(Context context, OneVideoPlayer oneVideoPlayer) {
            this.b = context;
            this.c = oneVideoPlayer;
        }

        @Override // xsna.m37
        public final void a(xtt0 xtt0Var, a aVar) {
            a aVar2 = aVar;
            boolean z = aVar2.d;
            Type type = aVar2.c;
            int i = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                nk80 nk80Var = xtt0Var instanceof nk80 ? (nk80) xtt0Var : null;
                if (nk80Var != null) {
                    l9p0 l9p0Var = ExtendedVideoTracksDialog.this.w;
                    nk80Var.c.setText(l9p0Var != null ? l9p0Var.a : null);
                    nk80Var.b.setText(l9p0Var != null ? l9p0Var.b : null);
                    return;
                }
                return;
            }
            if (i == 2) {
                mk80 mk80Var = xtt0Var instanceof mk80 ? (mk80) xtt0Var : null;
                if (mk80Var != null) {
                    mk80Var.c.setText(c(aVar2));
                    ((mk80) xtt0Var).a.setSelected(z);
                    return;
                }
                return;
            }
            ok80 ok80Var = xtt0Var instanceof ok80 ? (ok80) xtt0Var : null;
            if (ok80Var != null) {
                ImageView imageView = ok80Var.b;
                ok80Var.d.setText(c(aVar2));
                AppCompatTextView appCompatTextView = ok80Var.e;
                int i2 = a.C2175a.$EnumSwitchMapping$0[type.ordinal()];
                Integer valueOf = i2 != 1 ? i2 != 2 ? i2 != 3 ? null : Integer.valueOf(R.string.one_video_quality_extend_low_subtitle) : Integer.valueOf(R.string.one_video_quality_extend_high_subtitle) : Integer.valueOf(R.string.one_video_quality_extend_auto_subtitle);
                appCompatTextView.setText(valueOf != null ? this.b.getString(valueOf.intValue()) : null);
                imageView.setVisibility(z ? 0 : 8);
                imageView.setSelected(z);
            }
        }

        @Override // xsna.m37
        public final xtt0 b(int i, ViewGroup viewGroup) {
            int ordinal = Type.TOP.ordinal();
            ExtendedVideoTracksDialog extendedVideoTracksDialog = ExtendedVideoTracksDialog.this;
            if (i != ordinal) {
                if (i == Type.OTHER.ordinal()) {
                    return mk80.a(extendedVideoTracksDialog.getLayoutInflater(), viewGroup);
                }
                ok80 a2 = ok80.a(extendedVideoTracksDialog.getLayoutInflater(), viewGroup);
                a2.c.setVisibility(8);
                return a2;
            }
            View inflate = extendedVideoTracksDialog.getLayoutInflater().inflate(R.layout.one_video_dialog_quality_top_item_view, viewGroup, false);
            int i2 = R.id.subtitle;
            TextView textView = (TextView) k9q0.j(R.id.subtitle, inflate);
            if (textView != null) {
                i2 = R.id.title;
                TextView textView2 = (TextView) k9q0.j(R.id.title, inflate);
                if (textView2 != null) {
                    return new nk80((LinearLayout) inflate, textView, textView2);
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        }

        public final String c(a aVar) {
            StringBuilder sb = new StringBuilder();
            int i = a.C2175a.$EnumSwitchMapping$0[aVar.c.ordinal()];
            Integer valueOf = i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : Integer.valueOf(R.string.one_video_quality_extend_other) : Integer.valueOf(R.string.one_video_quality_extend_low) : Integer.valueOf(R.string.one_video_quality_extend_high) : Integer.valueOf(R.string.one_video_quality_extend_auto);
            Context context = this.b;
            sb.append(valueOf != null ? context.getString(valueOf.intValue()) : null);
            if (aVar.d) {
                one.video.player.tracks.c E = this.c.E();
                sb.append(" · ");
                sb.append(nlt0.a(E, context));
            }
            return sb.toString();
        }

        @Override // xsna.m37
        public final int getItemViewType(int i) {
            Type type;
            x xVar = ExtendedVideoTracksDialog.this.t;
            if (xVar == null) {
                xVar = null;
            }
            a aVar = (a) xVar.getCurrentList().get(i);
            if (aVar == null || (type = aVar.c) == null) {
                return 0;
            }
            return type.ordinal();
        }
    }

    /* compiled from: ExtendedVideoTracksDialog.kt */
    public static final class d implements f {
        public d() {
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void c(BaseVideoPlayer baseVideoPlayer, hk0 hk0Var) {
            ExtendedVideoTracksDialog.this.w();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void e(BaseVideoPlayer baseVideoPlayer, one.video.player.tracks.c cVar) {
            ExtendedVideoTracksDialog.this.w();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void n(xk80 xk80Var, one.video.player.tracks.c cVar) {
            ExtendedVideoTracksDialog.this.w();
        }

        @Override // one.video.player.f, one.video.player.OneVideoPlayer.c
        public final void z(BaseVideoPlayer baseVideoPlayer, OneVideoPlayer.State state, OneVideoPlayer.State state2) {
            if (state == OneVideoPlayer.State.BUFFERING) {
                if (state2 == OneVideoPlayer.State.PLAYING || state2 == OneVideoPlayer.State.PAUSED) {
                    ExtendedVideoTracksDialog.this.w();
                }
            }
        }
    }

    public ExtendedVideoTracksDialog(Context context, OneVideoPlayer oneVideoPlayer, l9p0 l9p0Var, rwm rwmVar) {
        super(context, oneVideoPlayer);
        this.w = l9p0Var;
        this.x = rwmVar;
        this.y = R.id.one_video_dialog_preset_quality_tag;
        this.A = new c(context, oneVideoPlayer);
        this.B = new d();
    }

    @Override // xsna.tc6, com.google.android.material.bottomsheet.b, xsna.b33, xsna.y8i, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w();
    }

    @Override // xsna.tc6
    public final m37<xtt0, a> r() {
        return this.A;
    }

    @Override // xsna.tc6
    public final int t() {
        return this.y;
    }

    @Override // xsna.tc6
    public final void u(g9m.a aVar) {
        int i = b.$EnumSwitchMapping$0[((a) aVar).c.ordinal()];
        if (i == 1) {
            l9p0 l9p0Var = this.w;
            if (l9p0Var != null) {
                l9p0Var.c.invoke();
                return;
            }
            return;
        }
        rwm rwmVar = this.x;
        OneVideoPlayer oneVideoPlayer = this.v;
        if (i == 2) {
            AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval = AdaptiveTrackSelectionInterval.DEFAULT;
            oneVideoPlayer.b0(hk0.a(oneVideoPlayer.P(), adaptiveTrackSelectionInterval.i(), adaptiveTrackSelectionInterval.h(), false, 12));
            oneVideoPlayer.o0();
            if (rwmVar != null) {
                rwmVar.a(new qwm.a(adaptiveTrackSelectionInterval));
            }
            dismiss();
            return;
        }
        if (i == 3) {
            AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval2 = AdaptiveTrackSelectionInterval.HIGH;
            oneVideoPlayer.b0(hk0.a(oneVideoPlayer.P(), adaptiveTrackSelectionInterval2.i(), adaptiveTrackSelectionInterval2.h(), false, 12));
            oneVideoPlayer.o0();
            if (rwmVar != null) {
                rwmVar.a(new qwm.a(adaptiveTrackSelectionInterval2));
            }
            dismiss();
            return;
        }
        if (i == 4) {
            AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval3 = AdaptiveTrackSelectionInterval.LOW;
            oneVideoPlayer.b0(hk0.a(oneVideoPlayer.P(), adaptiveTrackSelectionInterval3.i(), adaptiveTrackSelectionInterval3.h(), false, 12));
            oneVideoPlayer.o0();
            if (rwmVar != null) {
                rwmVar.a(new qwm.a(adaptiveTrackSelectionInterval3));
            }
            dismiss();
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.z != null) {
            return;
        }
        tlt0 tlt0Var = new tlt0(getContext(), oneVideoPlayer, rwmVar);
        tlt0Var.setOnDismissListener(new rcq(this, 0));
        tlt0Var.show();
        this.z = tlt0Var;
    }

    @Override // xsna.gk6
    public final OneVideoPlayer.c v() {
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        boolean z;
        boolean z2;
        x xVar = this.t;
        if (xVar == null) {
            xVar = null;
        }
        ArrayList arrayList = new ArrayList();
        OneVideoPlayer oneVideoPlayer = this.v;
        boolean z3 = oneVideoPlayer.J() != null;
        if (!z3) {
            hk0 P = oneVideoPlayer.P();
            AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval = AdaptiveTrackSelectionInterval.LOW;
            if (P.a == (adaptiveTrackSelectionInterval != null ? adaptiveTrackSelectionInterval.i() : null) && P.b == adaptiveTrackSelectionInterval.h()) {
                z = true;
                if (!z3) {
                    hk0 P2 = oneVideoPlayer.P();
                    AdaptiveTrackSelectionInterval adaptiveTrackSelectionInterval2 = AdaptiveTrackSelectionInterval.HIGH;
                    if (P2.a == (adaptiveTrackSelectionInterval2 != null ? adaptiveTrackSelectionInterval2.i() : null) && P2.b == adaptiveTrackSelectionInterval2.h()) {
                        z2 = true;
                        if (this.w != null) {
                            arrayList.add(new a(Type.TOP, false));
                        }
                        arrayList.add(new a(Type.AUTO, (!z3 || z || z2) ? false : true));
                        arrayList.add(new a(Type.HIGH, z2));
                        arrayList.add(new a(Type.LOW, z));
                        arrayList.add(new a(Type.OTHER, z3));
                        xVar.submitList(arrayList);
                    }
                }
                z2 = false;
                if (this.w != null) {
                }
                arrayList.add(new a(Type.AUTO, (!z3 || z || z2) ? false : true));
                arrayList.add(new a(Type.HIGH, z2));
                arrayList.add(new a(Type.LOW, z));
                arrayList.add(new a(Type.OTHER, z3));
                xVar.submitList(arrayList);
            }
        }
        z = false;
        if (!z3) {
        }
        z2 = false;
        if (this.w != null) {
        }
        arrayList.add(new a(Type.AUTO, (!z3 || z || z2) ? false : true));
        arrayList.add(new a(Type.HIGH, z2));
        arrayList.add(new a(Type.LOW, z));
        arrayList.add(new a(Type.OTHER, z3));
        xVar.submitList(arrayList);
    }
}
