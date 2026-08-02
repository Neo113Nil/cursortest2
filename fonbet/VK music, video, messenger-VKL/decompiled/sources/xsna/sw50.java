package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.b;
import com.vk.attachpicker.impl.PhotoEditorActivity;
import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.attachpicker.impl.fragment.video.AttachVideoFragment;
import com.vk.common.links.LaunchContext;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.widget.LifecycleHandler;
import com.vk.donut.impl.PaidSubscriptionsFragment;
import com.vk.dto.ProfileEditPage;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.superapp.api.dto.app.GameSubscription;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.GeoAttachment;
import java.io.File;
import java.util.ArrayList;
import kotlin.collections.builders.ListBuilder;
import xsna.tzp0;

/* compiled from: NavigationBridge.kt */
/* loaded from: classes.dex */
public interface sw50 {

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface a {
        j34 a(Fragment fragment);

        void b(AttachVideoFragment attachVideoFragment);

        j34 c(Activity activity);

        boolean d(FragmentImpl fragmentImpl);

        b.InterfaceC0381b e(FragmentImpl fragmentImpl);

        d1m0 f(StoryFragment storyFragment);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface b {
        Boolean a(Context context, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var);

        boolean b(peq0 peq0Var);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface c {
        boolean a(Context context, String str);

        void b(Context context, String str, String str2);

        boolean c(Context context, String str, String str2, String str3);

        io.reactivex.rxjava3.disposables.c d(Context context, ApiApplication apiApplication, String str);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface d {
        void a(Context context, wzs<? super Integer, ? super Intent, s3q0> wzsVar, int i, izs<? super Intent, s3q0> izsVar);

        void b(Activity activity);

        com.vk.attachpicker.screen.h c(PhotoEditorActivity photoEditorActivity, File file, boolean z);

        default void d(int i, Context context, izs izsVar) {
            a(context, new com.vk.movika.tools.controls.seekbar.j(context, 7), i, izsVar);
        }

        void e(FragmentActivity fragmentActivity, int i, boolean z, izs izsVar);

        void f(Context context, p9e p9eVar, i9e i9eVar);

        oz50 g(String str);

        Intent h(Context context, boolean z, int i, int i2, int i3);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface e {
        io.reactivex.rxjava3.internal.operators.observable.j1 a(Context context, tzp0.c cVar);

        void b(Context context, GeoAttachment geoAttachment);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface f {

        /* compiled from: NavigationBridge.kt */
        public static final class a {
            public final Boolean a;
            public final Intent b;
            public final Boolean c;
            public final Boolean d;
            public final GalleryPickerSourceConfiguration.EntryPoint e;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ a(Intent intent, GalleryPickerSourceConfiguration.EntryPoint entryPoint, int i) {
                this((i & 1) != 0 ? null : r0, (i & 2) != 0 ? null : intent, (i & 4) != 0 ? null : r0, (i & 8) != 0 ? null : r0, (i & 16) != 0 ? null : entryPoint);
                Boolean bool = Boolean.TRUE;
            }

            public a(Boolean bool, Intent intent, Boolean bool2, Boolean bool3, GalleryPickerSourceConfiguration.EntryPoint entryPoint) {
                this.a = bool;
                this.b = intent;
                this.c = bool2;
                this.d = bool3;
                this.e = entryPoint;
            }
        }

        boolean a(Intent intent);

        void b(LifecycleHandler lifecycleHandler);

        void c(u90 u90Var, UserId userId, String str, int i);

        void d(Fragment fragment, int i, int i2, a aVar);

        void e(jbs jbsVar);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface h {
        void a(FragmentActivity fragmentActivity);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface i {
        Boolean a(Context context, LaunchContext launchContext, peq0 peq0Var);

        boolean b(peq0 peq0Var);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface j {
        void a(FragmentActivity fragmentActivity);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface k {
        void a(Context context);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface l {
        void a(Context context);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface m {
        void a(FragmentImpl fragmentImpl, GameSubscription gameSubscription);

        void b(PaidSubscriptionsFragment paidSubscriptionsFragment);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface n {
        default void a(Context context, DonutLevel donutLevel, ArrayList arrayList, r9c0 r9c0Var) {
            rdi.E();
        }

        void b(FragmentImpl fragmentImpl, UserId[] userIdArr, int i, int i2);

        default void c(Context context, DonutLevel donutLevel, ListBuilder listBuilder) {
            rdi.E();
        }

        void d(Context context, PrivacySetting privacySetting);

        void e(Context context, PrivacySetting privacySetting);

        void g(Context context, String str, boolean z);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface o {
        oz50 a(ProfileEditPage profileEditPage);

        oz50 b(String str);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface p {
        void a(Context context, ExtendedUserProfile extendedUserProfile, boolean z);

        void b(Context context);

        void c(Context context);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface q {
        void a(Context context, Bundle bundle);
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface r {
        Boolean a(Context context, LaunchContext launchContext, yp80 yp80Var, peq0 peq0Var);

        boolean b(peq0 peq0Var);
    }

    h V();

    i a();

    b13 b(SearchStatsLoggingInfo searchStatsLoggingInfo);

    n c();

    l d();

    g e();

    e f();

    f g();

    d h();

    q i();

    c j();

    k j0();

    b k();

    o l();

    p m();

    r n();

    a p();

    m q();

    j r();

    default void o(Context context) {
    }

    /* compiled from: NavigationBridge.kt */
    /* loaded from: classes15.dex */
    public interface g {
        void a(Context context, String str);

        default void b(Context context, String str) {
        }
    }
}
