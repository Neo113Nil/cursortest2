package com.vkontakte.android.task.di.components;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.attachpicker.impl.AttachActivity;
import com.vk.core.fragments.FragmentEntry;
import com.vk.core.fragments.FragmentImpl;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.di.VideoPip2Component;
import com.vk.libvideo.api.pip2.VideoContainerFragmentEntry;
import com.vk.libvideo.api.pip2.VideoPipModeAction;
import com.vk.sharing.core.picker.GroupPickerActivity;
import com.vk.sharing.im_engine_impl.SharingImEngineActivity;
import com.vk.video.ui.edit.fragments.VideoAlbumEditorFragment;
import com.vkontakte.android.FragmentWrapperActivity;
import com.vkontakte.android.TabletDialogActivity;
import com.vkontakte.android.VKActivity;
import io.reactivex.rxjava3.subjects.f;
import java.util.Iterator;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.aqi;
import xsna.c5b0;
import xsna.c8m;
import xsna.ep;
import xsna.epx;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gjs0;
import xsna.han;
import xsna.hpf0;
import xsna.jvg;
import xsna.msy;
import xsna.n3t0;
import xsna.nwy;
import xsna.oz50;
import xsna.pwj0;
import xsna.qcy;
import xsna.qss0;
import xsna.rfc;
import xsna.rl3;
import xsna.rsr;
import xsna.s3a;
import xsna.t3a;
import xsna.w62;

/* compiled from: SuperAppPip2Component.kt */
/* loaded from: classes11.dex */
public final class SuperAppPip2Component implements VideoPip2Component {
    public static final /* synthetic */ qcy<Object>[] f;
    public final Object a;
    public final nwy b = new nwy(new jvg(10));
    public final nwy c = new nwy(new s3a(9));
    public final nwy d = new nwy(new t3a(this, 4));
    public final nwy e = new nwy(new aqi(9));

    /* compiled from: SuperAppPip2Component.kt */
    public static final class a implements c8m<VideoPip2Component, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SuperAppPip2Component(msy.a(LazyThreadSafetyMode.NONE, new w62(g8mVar, 6)));
        }
    }

    /* compiled from: SuperAppPip2Component.kt */
    /* loaded from: classes7.dex */
    public static final class b implements c5b0 {
        public final Set<a> a = rl3.y0(new a[]{new a.C2106a(AttachActivity.class), new a.C2106a(SharingImEngineActivity.class), new a.C2106a(GroupPickerActivity.class), new a.C2106a(TabletDialogActivity.class), new a.C2107b(FragmentWrapperActivity.class)});

        /* compiled from: SuperAppPip2Component.kt */
        public static abstract class a {
            public final Class<? extends VKActivity> a;

            /* compiled from: SuperAppPip2Component.kt */
            /* renamed from: com.vkontakte.android.task.di.components.SuperAppPip2Component$b$a$a, reason: collision with other inner class name */
            public static final class C2106a extends a {
            }

            /* compiled from: SuperAppPip2Component.kt */
            /* renamed from: com.vkontakte.android.task.di.components.SuperAppPip2Component$b$a$b, reason: collision with other inner class name */
            public static final class C2107b extends a {
                @Override // com.vkontakte.android.task.di.components.SuperAppPip2Component.b.a
                public final boolean a(Intent intent) {
                    Class<? extends FragmentImpl> cls;
                    if (!super.a(intent)) {
                        return false;
                    }
                    rsr rsrVar = oz50.k;
                    FragmentEntry c = oz50.b.c(intent.getExtras());
                    return epx.f((c == null || (cls = c.b) == null) ? null : cls.getName(), VideoAlbumEditorFragment.class.getName());
                }
            }

            public a() {
                throw null;
            }

            public a(Class cls) {
                this.a = cls;
            }

            public boolean a(Intent intent) {
                ComponentName component = intent.getComponent();
                return epx.f(component != null ? component.getClassName() : null, this.a.getName());
            }
        }

        @Override // xsna.c5b0
        public final boolean a(Intent intent) {
            Object obj;
            Iterator<T> it = this.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((a) obj).a(intent)) {
                    break;
                }
            }
            return obj != null;
        }
    }

    /* compiled from: SuperAppPip2Component.kt */
    /* loaded from: classes7.dex */
    public static final class c implements com.vk.libvideo.api.pip2.a {
        public final Object a;

        /* compiled from: SuperAppPip2Component.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[VideoContainerFragmentEntry.Type.values().length];
                try {
                    iArr[VideoContainerFragmentEntry.Type.Discovery.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VideoContainerFragmentEntry.Type.Live.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c(Lazy<? extends VideoMinimizablePlayerComponent> lazy) {
            this.a = lazy;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.libvideo.api.pip2.a
        public final VideoContainerFragmentEntry a(Fragment fragment, Bundle bundle, gjs0 gjs0Var) {
            rfc a2 = fpf0.a(fragment.getClass());
            if (a2.equals(han.i)) {
                return new han((VideoMinimizablePlayerComponent) this.a.getValue(), bundle, gjs0Var, fragment);
            }
            if (a2.equals(qss0.e)) {
                return new qss0(bundle, fragment);
            }
            return null;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
        @Override // com.vk.libvideo.api.pip2.a
        public final VideoContainerFragmentEntry b(VideoContainerFragmentEntry.Type type, Bundle bundle, gjs0 gjs0Var) {
            int i = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i == 1) {
                return new han((VideoMinimizablePlayerComponent) this.a.getValue(), bundle, gjs0Var, null);
            }
            if (i == 2) {
                return new qss0(bundle, null);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuperAppPip2Component.class, "pipEvents", "getPipEvents()Lio/reactivex/rxjava3/subjects/PublishSubject;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, SuperAppPip2Component.class, "pipActionsBus", "getPipActionsBus()Lio/reactivex/rxjava3/subjects/PublishSubject;", hpf0Var), ep.a(0, SuperAppPip2Component.class, "videoContainerFragmentEntryFactory", "getVideoContainerFragmentEntryFactory()Lcom/vk/libvideo/api/pip2/VideoContainerFragmentEntryFactory;", hpf0Var), ep.a(0, SuperAppPip2Component.class, "playerTaskActivityLaunchValidator", "getPlayerTaskActivityLaunchValidator()Lcom/vk/libvideo/api/pip2/PlayerTaskActivityLaunchValidator;", hpf0Var)};
    }

    public SuperAppPip2Component(Lazy<? extends VideoMinimizablePlayerComponent> lazy) {
        this.a = lazy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VideoPip2Component
    public final f<n3t0> L3() {
        qcy<Object> qcyVar = f[0];
        return (f) this.b.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VideoPip2Component
    public final f<VideoPipModeAction> Lb() {
        qcy<Object> qcyVar = f[1];
        return (f) this.c.c();
    }

    @Override // com.vk.libvideo.api.di.VideoPip2Component
    public final c5b0 N5() {
        qcy<Object> qcyVar = f[3];
        return (c5b0) this.e.c();
    }

    @Override // com.vk.libvideo.api.di.VideoPip2Component
    public final com.vk.libvideo.api.pip2.a sd() {
        qcy<Object> qcyVar = f[2];
        return (com.vk.libvideo.api.pip2.a) this.d.c();
    }
}
