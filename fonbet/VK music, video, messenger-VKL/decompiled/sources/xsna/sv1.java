package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.widget.PopupWindow;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.gms.internal.measurement.zznn;
import com.ironsource.X3;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.media.dto.MediaRestrictionDto;
import com.vk.api.generated.newsfeed.dto.NewsfeedItemDebugInfoDto;
import com.vk.api.generated.video.dto.VideoRestrictionButtonDto;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.preference.Preference;
import com.vk.core.sticky_header.OffsetOrientation;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.profile.Address;
import com.vk.dto.profile.OpenStatus;
import com.vk.feed.core.models.DebugInfo;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.analytics.VkAnalyticsUserType;
import com.vkontakte.android.R;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ExecutionException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.mut0;

/* compiled from: AlwaysOffExemplarFilter.java */
/* loaded from: classes8.dex */
public final class sv1 implements d4q, q701, jp70, fgh0 {
    public static final sv1 c = new sv1(0);
    public static final float[] d = new float[9];
    public static final StackTraceElement[] e = new StackTraceElement[0];
    public static final sv1 f = new sv1(5);
    public static final /* synthetic */ sv1 g = new sv1(6);
    public final /* synthetic */ int b;

    public /* synthetic */ sv1(int i) {
        this.b = i;
    }

    public static void B(String str, Number number) {
        yh70.b.d(str, number);
        o970.b.d(str, number);
    }

    public static void C() {
        Preference.B(yh70.b.b());
        Preference.B(o970.b.b());
    }

    public static void D(PopupWindow popupWindow) {
        popupWindow.setWindowLayoutType(2);
    }

    public static final File E(Uri uri) {
        if (!epx.f(uri.getScheme(), X3.i.b)) {
            throw new IllegalArgumentException(i6n0.a(uri, "Uri lacks 'file' scheme: ").toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException(i6n0.a(uri, "Uri path is null: ").toString());
    }

    public static final void F(plb0 plb0Var, long j, izs izsVar, boolean z) {
        MotionEvent a = plb0Var.a();
        if (a == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = a.getAction();
        if (z) {
            a.setAction(3);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        a.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        izsVar.invoke(a);
        a.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        a.setAction(action);
    }

    public static final ComposeView e(Context context) {
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(g(context));
        return composeView;
    }

    public static final mut0 g(Context context) {
        vbs n;
        ComponentCallbacks2 h = e3m.h(context);
        xbs xbsVar = h instanceof xbs ? (xbs) h : null;
        return (xbsVar == null || (n = xbsVar.n()) == null) ? mut0.b.a : new zgn(n);
    }

    public static final Object i(ugz ugzVar, ContinuationImpl continuationImpl) {
        try {
            if (ugzVar.isDone()) {
                return hr80.y(ugzVar);
            }
            lq9 lq9Var = new lq9(1, s7s0.c(continuationImpl));
            lq9Var.o();
            ugzVar.addListener(new d0p0(ugzVar, lq9Var), kzm.INSTANCE);
            lq9Var.r(new b98(ugzVar, 1));
            Object n = lq9Var.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            return n;
        } catch (ExecutionException e2) {
            throw e2.getCause();
        }
    }

    public static final Integer j(Location location, Address address) {
        float[] fArr = new float[1];
        Location.distanceBetween(location.getLatitude(), location.getLongitude(), address.c, address.d, fArr);
        Float M = rl3.M(fArr);
        if (M != null) {
            return Integer.valueOf((int) M.floatValue());
        }
        return null;
    }

    public static final com.vk.im.ui.components.msg_list.a k(il30 il30Var) {
        return new com.vk.im.ui.components.msg_list.a(il30Var);
    }

    public static final long l(hyg0 hyg0Var) {
        if (p(hyg0Var) == 0) {
            return -1L;
        }
        qyg0 V0 = hyg0Var.V0("SELECT last_insert_rowid()");
        try {
            V0.step();
            long j = V0.getLong(0);
            yfb.d(V0, null);
            return j;
        } finally {
        }
    }

    public static final MultiAccountEntryPoint m(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("multiaccount_entry_point_key", MultiAccountEntryPoint.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("multiaccount_entry_point_key");
            if (!(parcelable3 instanceof MultiAccountEntryPoint)) {
                parcelable3 = null;
            }
            parcelable = (MultiAccountEntryPoint) parcelable3;
        }
        return (MultiAccountEntryPoint) parcelable;
    }

    public static final String n(e1w e1wVar) {
        String o = o(e1wVar);
        return o == null ? "cached" : o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String o(e1w e1wVar) {
        if (e1wVar instanceof m2w) {
            return ((m2w) e1wVar).a();
        }
        return null;
    }

    public static final int p(hyg0 hyg0Var) {
        qyg0 V0 = hyg0Var.V0("SELECT changes()");
        try {
            V0.step();
            int i = (int) V0.getLong(0);
            yfb.d(V0, null);
            return i;
        } finally {
        }
    }

    public static final CharSequence q(Address address, Context context) {
        OpenStatus openStatus = address.t;
        int i = address.m;
        int i2 = R.attr.vk_ui_text_positive;
        if (openStatus == null) {
            if (i != 4) {
                return i == 3 ? context.getString(R.string.foreve_closed) : i == 1 ? context.getString(R.string.temporary_closed) : context.getString(R.string.work_status_no_info);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) context.getString(R.string.address_opened));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_positive, context)), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " • ");
            spannableStringBuilder.append((CharSequence) context.getString(R.string.address_open_all_day));
            return new SpannedString(spannableStringBuilder);
        }
        String str = openStatus.d;
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        int i3 = openStatus.b;
        if (i3 != 1) {
            i2 = i3 != 2 ? i3 != 3 ? R.attr.vk_ui_text_secondary : R.attr.vk_ui_accent_orange : R.attr.vk_ui_text_negative;
        }
        spannableStringBuilder2.append((CharSequence) openStatus.c);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(krv0.m(i2, context)), 0, spannableStringBuilder2.length(), 33);
        if (!drm0.N(str)) {
            spannableStringBuilder2.append((CharSequence) " • ");
            spannableStringBuilder2.append((CharSequence) str);
        }
        return new SpannedString(spannableStringBuilder2);
    }

    public static final boolean r(Bundle bundle) {
        Object obj;
        Object parcelable;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("multiaccount_entry_point_key", MultiAccountEntryPoint.class);
                obj = (Parcelable) parcelable;
            } else {
                Object parcelable2 = bundle.getParcelable("multiaccount_entry_point_key");
                obj = (MultiAccountEntryPoint) (parcelable2 instanceof MultiAccountEntryPoint ? parcelable2 : null);
            }
            r0 = (MultiAccountEntryPoint) obj;
        }
        return r0 != null;
    }

    public static tzy s(lg90 lg90Var, String str, long j, androidx.compose.runtime.a aVar, int i) {
        if ((i & 4) != 0) {
            s1v.k();
            j = on20.a.e(aVar);
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1507306643, 24632, -1, "com.vk.core.compose.component.input.InputSelect.Left.Icon.Companion.invoke (InputSelect.kt:39)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2116843222, ApiInvocationException.ErrorCodes.CENSOR_MATCH, -1, "com.vk.core.compose.component.input.remember (LeftIconImpl.kt:48)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = new tzy(j, str, lg90Var);
            aVar.R(x);
        }
        tzy tzyVar = (tzy) x;
        ((zak0) tzyVar.a).setValue(lg90Var);
        ((zak0) tzyVar.b).setValue(str);
        ((zak0) tzyVar.c).setValue(new l5g(j));
        ((zak0) tzyVar.d).setValue(null);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return tzyVar;
    }

    public static final boolean t(Throwable th) {
        while (th != null) {
            if ((th instanceof InterruptedException) || (th instanceof InterruptedIOException)) {
                return true;
            }
            if (th.equals(th.getCause())) {
                return false;
            }
            th = th.getCause();
        }
        return false;
    }

    public static final boolean u(Throwable th) {
        while (th != null) {
            if (th instanceof IOException) {
                return true;
            }
            if (th.equals(th.getCause())) {
                return false;
            }
            th = th.getCause();
        }
        return false;
    }

    public static PhotoRestriction v(MediaRestrictionDto mediaRestrictionDto) {
        VideoRestrictionButtonDto.ActionDto d2;
        if (mediaRestrictionDto == null) {
            return null;
        }
        VideoRestrictionButtonDto e2 = mediaRestrictionDto.e();
        String i = (e2 == null || (d2 = e2.d()) == null) ? null : d2.i();
        if (i == null) {
            i = "";
        }
        String title = e2 != null ? e2.getTitle() : null;
        if (title == null) {
            title = "";
        }
        RestrictionButton restrictionButton = (i.length() == 0 && title.length() == 0) ? null : new RestrictionButton(i, title, e2 != null ? e2.e() : null);
        String title2 = mediaRestrictionDto.getTitle();
        String n = mediaRestrictionDto.n();
        return new PhotoRestriction(title2, n != null ? n : "", mediaRestrictionDto.d() == BaseBoolIntDto.YES, restrictionButton);
    }

    public static DebugInfo w(NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto) {
        String d2 = newsfeedItemDebugInfoDto.d();
        bpn0 bpn0Var = cqm0.a;
        if (d2 == null) {
            d2 = "";
        }
        String description = newsfeedItemDebugInfoDto.getDescription();
        return new DebugInfo(d2, description != null ? description : "");
    }

    public static final Bundle x(MultiAccountEntryPoint multiAccountEntryPoint, VkAnalyticsUserType vkAnalyticsUserType, VkAnalyticsUserType vkAnalyticsUserType2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("multiaccount_entry_point_key", multiAccountEntryPoint);
        bundle.putParcelable("multiaccount_profile_from", vkAnalyticsUserType);
        bundle.putParcelable("multiaccount_profile_to", vkAnalyticsUserType2);
        return bundle;
    }

    public static final q630 z(q630 q630Var, izs izsVar) {
        return q630Var.g(new sb80(izsVar));
    }

    public void A(llh0 llh0Var) {
        bwr0 fyr0Var;
        if (llh0Var instanceof dwr0) {
            dwr0 dwr0Var = (dwr0) llh0Var;
            SdkVideoFile sdkVideoFile = dwr0Var.a;
            fyr0Var = new cwr0(sdkVideoFile != null ? k15.A(sdkVideoFile) : null, dwr0Var.b, 28);
        } else if (llh0Var instanceof gwr0) {
            gwr0 gwr0Var = (gwr0) llh0Var;
            fyr0Var = new fwr0(gwr0Var.a, gwr0Var.b);
        } else if (llh0Var instanceof lwr0) {
            fyr0Var = new kwr0(((lwr0) llh0Var).a);
        } else if (llh0Var instanceof nwr0) {
            fyr0Var = new mwr0(((nwr0) llh0Var).a);
        } else if (llh0Var instanceof swr0) {
            fyr0Var = new rwr0(((swr0) llh0Var).a);
        } else if (llh0Var instanceof zwr0) {
            fyr0Var = new ywr0(k15.A(((zwr0) llh0Var).a));
        } else if (llh0Var instanceof bxr0) {
            fyr0Var = new axr0(k15.A(((bxr0) llh0Var).a));
        } else if (llh0Var instanceof dxr0) {
            fyr0Var = new cxr0(k15.A(((dxr0) llh0Var).a));
        } else if (llh0Var instanceof gxr0) {
            fyr0Var = new fxr0();
        } else if (llh0Var instanceof ixr0) {
            fyr0Var = new hxr0(k15.A(((ixr0) llh0Var).a), false);
        } else if (llh0Var instanceof nxr0) {
            nxr0 nxr0Var = (nxr0) llh0Var;
            fyr0Var = new mxr0(k15.A(nxr0Var.a), nxr0Var.b, nxr0Var.c, nxr0Var.d);
        } else if (llh0Var instanceof pxr0) {
            pxr0 pxr0Var = (pxr0) llh0Var;
            fyr0Var = new oxr0(k15.A(pxr0Var.a), pxr0Var.b);
        } else if (llh0Var instanceof rxr0) {
            fyr0Var = new qxr0(k15.A(((rxr0) llh0Var).a));
        } else if (llh0Var instanceof txr0) {
            fyr0Var = new sxr0(((txr0) llh0Var).a);
        } else if (llh0Var.equals(vxr0.a)) {
            fyr0Var = uxr0.a;
        } else if (llh0Var instanceof xxr0) {
            xxr0 xxr0Var = (xxr0) llh0Var;
            fyr0Var = new wxr0(k15.A(xxr0Var.a), xxr0Var.b, xxr0Var.c);
        } else if (llh0Var instanceof zxr0) {
            fyr0Var = new yxr0(k15.A(((zxr0) llh0Var).a));
        } else if (llh0Var.equals(byr0.a)) {
            fyr0Var = ayr0.a;
        } else if (llh0Var instanceof eyr0) {
            fyr0Var = new dyr0(k15.A(((eyr0) llh0Var).a));
        } else {
            if (!(llh0Var instanceof gyr0)) {
                throw new NoWhenBranchMatchedException();
            }
            fyr0Var = new fyr0(k15.A(((gyr0) llh0Var).a));
        }
        wjs0.a(fyr0Var);
    }

    @Override // xsna.fgh0
    public int c(OffsetOrientation offsetOrientation, rfc rfcVar) {
        return -1;
    }

    @Override // xsna.d4q
    public boolean d(wmj wmjVar) {
        return false;
    }

    @Override // xsna.d4q
    public boolean f(wmj wmjVar) {
        return false;
    }

    @Override // xsna.jp70
    public Object h() {
        return new TreeSet();
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return "AlwaysOffExemplarFilter";
            default:
                return super.toString();
        }
    }

    @Override // xsna.q701
    public Object zza() {
        List list = s701.a;
        return Long.valueOf(zznn.zzq());
    }

    @Override // xsna.fgh0
    public void a() {
    }

    @Override // xsna.fgh0
    public void b(OffsetOrientation offsetOrientation, com.vk.core.sticky_header.a aVar) {
    }
}
