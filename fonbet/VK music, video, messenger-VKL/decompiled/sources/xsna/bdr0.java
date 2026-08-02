package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.update.core.InAppUpdateUi;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.utj;

/* compiled from: VKInAppUpdateUi.kt */
/* loaded from: classes6.dex */
public final class bdr0 implements InAppUpdateUi {
    public final Activity a;
    public final a b;
    public utj c;
    public utj d;
    public boolean e;
    public final bpn0 f = new bpn0(new vpn0(this, 6));
    public final int g = R.string.update_permissions_rationale;

    /* compiled from: VKInAppUpdateUi.kt */
    public static final class a {
        public final b a;
        public final c b;

        public a(b bVar, c cVar) {
            this.a = bVar;
            this.b = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.update_permissions_rationale) + shy.a(R.string.vk_update_downloading_retry, shy.a(R.string.update_downloading_error, shy.a(R.string.update_being_downloaded, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
        }

        public final String toString() {
            return "Config(downloadConfig=" + this.a + ", installConfig=" + this.b + ", downloadingMessageRes=2131965098, downloadErrorRes=2131965100, downloadRetryRes=2131968005, permissionsRationaleRes=2131965111)";
        }
    }

    /* compiled from: VKInAppUpdateUi.kt */
    public static final class b {
        public final int a;
        public final String b;
        public final String c;

        public b(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            bVar.getClass();
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int a = shy.a(this.a, shy.a(R.string.update_later, shy.a(R.string.update_now, Integer.hashCode(R.string.update_title) * 31, 31), 31), 31);
            String str = this.b;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DownloadConfig(downloadTitleRes=2131965112, updateNowTitleRes=2131965110, updateLaterTitleRes=2131965109, downloadIconRes=");
            sb.append(this.a);
            sb.append(", updateTitleString=");
            sb.append(this.b);
            sb.append(", updateSubtitleString=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: VKInAppUpdateUi.kt */
    public static final class c {
        public final int a;
        public final int b;
        public final int c;

        public c() {
            this(R.string.vk_update_install, R.string.vk_update_downloaded, R.string.vk_update_installation_error);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InstallConfig(installButtonRes=");
            sb.append(this.a);
            sb.append(", installMessageRes=");
            sb.append(this.b);
            sb.append(", installErrorRes=");
            return vu5.b(sb, this.c, ')');
        }

        public c(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* compiled from: VKInAppUpdateUi.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InAppUpdateUi.DownloadInfo.DialogType.values().length];
            try {
                iArr[InAppUpdateUi.DownloadInfo.DialogType.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppUpdateUi.DownloadInfo.DialogType.INSTALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public bdr0(Activity activity, a aVar) {
        this.a = activity;
        this.b = aVar;
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void a(Throwable th) {
        utj utjVar = this.d;
        if (utjVar != null) {
            utjVar.b();
        }
        this.d = null;
        this.e = false;
        utj.a aVar = new utj.a((Context) this.f.getValue());
        aVar.j(this.b.b.c);
        aVar.m();
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void b(long j, long j2) {
        if (this.d != null || this.e) {
            return;
        }
        this.e = true;
        utj.a aVar = new utj.a((Context) this.f.getValue());
        aVar.t = new xc50(this, 29);
        aVar.j(R.string.update_being_downloaded);
        this.d = aVar.m();
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void c(final InAppUpdateUi.DownloadInfo downloadInfo) {
        int i;
        a aVar = this.b;
        b bVar = aVar.a;
        dw20.b bVar2 = new dw20.b((Context) this.f.getValue(), null);
        cbq.a(bVar2);
        String str = bVar.b;
        String str2 = bVar.c;
        if (str != null) {
            bVar2.A0(Integer.valueOf(R.style.VkUiTypography_Title2));
            bVar2.w0(str);
        } else {
            bVar2.v0(R.string.update_title);
        }
        if (str2 != null) {
            bVar2.t0(e3m.f(R.attr.vk_ui_text_subhead, bVar2.c));
            Integer valueOf = Integer.valueOf(R.style.VkUiTypography_TextNormal);
            e.a aVar2 = bVar2.d;
            aVar2.d0 = valueOf;
            aVar2.f0 = Integer.valueOf(iah0.a(8));
            aVar2.g0 = Integer.valueOf(iah0.a(16));
            bVar2.s0(str2);
        }
        dw20.b U = bVar2.L(bVar.a).X(downloadInfo.b).U(R.string.update_later, new hyz(downloadInfo, 1));
        int i2 = d.$EnumSwitchMapping$0[downloadInfo.c.ordinal()];
        if (i2 == 1) {
            i = R.string.update_now;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = aVar.b.a;
        }
        U.i0(i, new hz20() { // from class: xsna.adr0
            @Override // xsna.hz20
            public final void a(int i3) {
                InAppUpdateUi.DownloadInfo.this.a.invoke();
            }
        });
        U.I0("UPDATE_AVAILABLE");
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void d(fy0 fy0Var) {
        utj utjVar = this.d;
        if (utjVar != null) {
            utjVar.b();
        }
        this.d = null;
        this.e = false;
        if (this.c != null) {
            return;
        }
        c cVar = this.b.b;
        utj.a aVar = new utj.a((Context) this.f.getValue());
        aVar.q = -1L;
        aVar.j(cVar.b);
        aVar.d(cVar.a, new vnb0(5, fy0Var, this));
        aVar.t = new ece0(this, 19);
        this.c = aVar.m();
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final int e() {
        return this.g;
    }

    @Override // com.vk.update.core.InAppUpdateUi
    public final void f(Throwable th, ni0 ni0Var) {
        utj utjVar = this.d;
        if (utjVar != null) {
            utjVar.b();
        }
        this.d = null;
        this.e = false;
        utj.a aVar = new utj.a((Context) this.f.getValue());
        aVar.q = -1L;
        aVar.t = new dso0(this, 7);
        aVar.j(R.string.update_downloading_error);
        aVar.d(R.string.vk_update_downloading_retry, new np5(24, this, ni0Var));
        this.d = aVar.m();
    }
}
