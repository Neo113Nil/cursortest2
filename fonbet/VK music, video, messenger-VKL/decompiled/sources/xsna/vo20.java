package xsna;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.miniapps.impl.picture_in_picture.feature.data.MiniAppNetworkState;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.e3m;
import xsna.i330;
import xsna.ro20;

/* compiled from: MiniAppCallPiPView.kt */
/* loaded from: classes7.dex */
public final class vo20 {
    public final l7s a;

    @SuppressLint({"InflateParams"})
    public final ViewGroup b;
    public final VKImageView c;
    public final VKImageView d;
    public final TextView e;
    public final ImageView f;
    public final View g;
    public final View h;
    public final TextView i;
    public final ImageView j;
    public final TextView k;
    public final View l;
    public final Drawable m;
    public final Drawable n;
    public final Drawable o;
    public final io.reactivex.rxjava3.subjects.f<cp20> p;
    public final i330<ro20> q;
    public boolean r;
    public final no20 s;
    public final io.reactivex.rxjava3.disposables.b t;

    /* compiled from: MiniAppCallPiPView.kt */
    public static final class a {
        public final boolean a;
        public final MiniAppNetworkState b;

        public a(boolean z, MiniAppNetworkState miniAppNetworkState) {
            this.a = z;
            this.b = miniAppNetworkState;
        }
    }

    /* compiled from: MiniAppCallPiPView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MiniAppNetworkState.values().length];
            try {
                iArr[MiniAppNetworkState.GOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MiniAppNetworkState.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MiniAppNetworkState.BAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vo20(l7s l7sVar) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable mutate;
        this.a = l7sVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(l7sVar).inflate(R.layout.mini_app_call_pip, (ViewGroup) null, false);
        this.b = viewGroup;
        VKImageView vKImageView = (VKImageView) viewGroup.findViewById(R.id.avatar_image);
        this.c = vKImageView;
        VKImageView vKImageView2 = (VKImageView) viewGroup.findViewById(R.id.avatar_blur);
        this.d = vKImageView2;
        this.e = (TextView) viewGroup.findViewById(R.id.title);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.mute);
        this.f = imageView;
        View findViewById = viewGroup.findViewById(R.id.reject);
        this.g = findViewById;
        this.h = viewGroup.findViewById(R.id.participants_count_image);
        this.i = (TextView) viewGroup.findViewById(R.id.participants_count_text_view);
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.connection_status);
        this.j = imageView2;
        this.k = (TextView) viewGroup.findViewById(R.id.own_state_title);
        this.l = viewGroup.findViewById(R.id.own_state_background);
        this.p = new io.reactivex.rxjava3.subjects.f<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        arrayList.add(new i330.b(new bod(2), new dxh(this, 26), new kxa((byte) 0, 5)));
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        arrayList2.add(new i330.b(wo20.b, new pba(1, this, vo20.class, "onSpeakerChanged", "onSpeakerChanged(Lcom/vk/voip/miniapps/impl/picture_in_picture/feature/data/MiniAppCallPiPSpeakerInfo;)V", i, 5), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(new xo20(1, this, vo20.class, "onMicrophoneChangeModel", "onMicrophoneChangeModel(Lcom/vk/voip/miniapps/impl/picture_in_picture/feature/MiniAppCallPiPFeatureState$Active;)Z", 0), new yo20(1, this, vo20.class, "onMicrophoneStateChanged", "onMicrophoneStateChanged(Z)V", i, 0), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(new zo20(1, this, vo20.class, "onParticipantsCountModel", "onParticipantsCountModel(Lcom/vk/voip/miniapps/impl/picture_in_picture/feature/MiniAppCallPiPFeatureState$Active;)I", 0), new p5e(1, this, vo20.class, "onParticipantsCountChange", "onParticipantsCountChange(I)V", i, 3), new pv7((byte) 0, 3)));
        arrayList2.add(new i330.b(new ap20(1, this, vo20.class, "onOwnStateModel", "onOwnStateModel(Lcom/vk/voip/miniapps/impl/picture_in_picture/feature/MiniAppCallPiPFeatureState$Active;)Lcom/vk/voip/miniapps/impl/picture_in_picture/view/MiniAppCallPiPView$OwnState;", 0), new bp20(1, this, vo20.class, "onOwnStateChange", "onOwnStateChange(Lcom/vk/voip/miniapps/impl/picture_in_picture/view/MiniAppCallPiPView$OwnState;)V", 0), new pv7((byte) 0, 3)));
        hashMap.put(fpf0.a(ro20.a.class), new i330(arrayList2, hashMap2));
        i330<ro20> i330Var = new i330<>(arrayList, hashMap);
        this.q = i330Var;
        this.r = true;
        this.s = new no20();
        this.t = new io.reactivex.rxjava3.disposables.b();
        vKImageView2.setPostprocessor(new hh7(iah0.a(15), Color.parseColor("#8f000000")));
        vKImageView.setPostprocessor(new zng0());
        bwt0.i0(imageView, new udo(this, 28));
        bwt0.i0(findViewById, new bjk(this, 19));
        imageView2.setImageDrawable(new vup0(l7sVar));
        i330Var.b(ro20.b.a);
        int color = l7sVar.getColor(R.color.vk_white);
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(R.drawable.vk_icon_connection_16, l7sVar);
        if (a2 == null || (drawable = a2.mutate()) == null) {
            drawable = null;
        } else {
            drawable.setTint(color);
        }
        this.m = drawable;
        Drawable a3 = m33.a(R.drawable.vk_icon_connection_16, l7sVar);
        if (a3 == null || (drawable2 = a3.mutate()) == null) {
            drawable2 = null;
        } else {
            drawable2.setTint(color);
        }
        this.n = drawable2;
        Drawable a4 = m33.a(R.drawable.vk_icon_sync_16, l7sVar);
        if (a4 == null || (mutate = a4.mutate()) == null) {
            drawable3 = null;
        } else {
            mutate.setTint(color);
            drawable3 = mutate;
        }
        this.o = drawable3;
    }

    public static int a(MiniAppNetworkState miniAppNetworkState) {
        int i = b.$EnumSwitchMapping$0[miniAppNetworkState.ordinal()];
        if (i == 1) {
            return R.color.vk_green;
        }
        if (i == 2) {
            return R.color.vk_yellow_sunflower;
        }
        if (i == 3) {
            return R.color.vk_red_light;
        }
        throw new NoWhenBranchMatchedException();
    }
}
