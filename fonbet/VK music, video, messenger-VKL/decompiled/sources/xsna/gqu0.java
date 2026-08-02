package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.ui.components.dialogs_header.vc.HeaderInfo;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.equ0;

/* compiled from: VkDialogsHeaderVc.kt */
/* loaded from: classes2.dex */
public final class gqu0 implements zqm {
    public final Context a;
    public final View b;
    public final TextView c;
    public equ0.b d;
    public DialogsFilter e;
    public HeaderInfo f;
    public final boolean g;
    public final s5o h;
    public final View i;
    public final bpn0 j;

    /* compiled from: VkDialogsHeaderVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HeaderInfo.values().length];
            try {
                iArr2[HeaderInfo.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[HeaderInfo.REFRESHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[HeaderInfo.WAIT_FOR_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HeaderInfo.CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: VkDialogsHeaderVc.kt */
    public static final class b {
        public b() {
        }
    }

    public gqu0(LayoutInflater layoutInflater, Toolbar toolbar, xdw xdwVar) {
        Context context = layoutInflater.getContext();
        this.a = context;
        View inflate = layoutInflater.inflate(R.layout.vkim_dialogs_toolbar, (ViewGroup) toolbar, false);
        this.b = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        this.c = textView;
        this.e = DialogsFilter.MAIN;
        this.f = HeaderInfo.CONNECTING;
        xdwVar.getClass();
        this.g = true;
        this.j = new bpn0(new qah0(this, 24));
        toolbar.setTitle((CharSequence) null);
        toolbar.setSubtitle((CharSequence) null);
        toolbar.l(R.menu.vkim_dialogs);
        bwt0.l0(toolbar, new yyl0(this, 18));
        toolbar.addView(inflate);
        this.i = toolbar.findViewById(R.id.add);
        Drawable e = e3m.e(R.attr.im_ic_write_msg, context);
        if (e != null) {
            float f = 1;
            s5o s5oVar = new s5o(e, new Rect(0, -iah0.a(f), -iah0.a(f), 0), e3m.f(R.attr.vk_legacy_counter_prominent_background, context));
            this.h = s5oVar;
            MenuItem findItem = toolbar.getMenu().findItem(R.id.add);
            if (findItem != null) {
                findItem.setIcon(s5oVar);
            }
            s5oVar.e = false;
            s5oVar.invalidateSelf();
        }
        MenuItem findItem2 = toolbar.getMenu().findItem(R.id.call);
        if (findItem2 != null) {
            findItem2.setVisible(true);
        }
        f4m.a(toolbar, new j1k0(6, toolbar, this));
        textView.setTextAppearance(R.style.VkLegacyTypography_Title1_Toolbar);
        textView.setAutoSizeTextTypeUniformWithConfiguration(14, 21, 1, 2);
        d();
        MenuItem findItem3 = toolbar.getMenu().findItem(R.id.search);
        if (findItem3 != null) {
            findItem3.setVisible(true);
        }
    }

    @Override // xsna.zqm
    public final void b(DialogsFilter dialogsFilter) {
        if (this.e != dialogsFilter) {
            this.e = dialogsFilter;
            d();
        }
    }

    @Override // xsna.zqm
    public final void c(HeaderInfo headerInfo) {
        if (this.f != headerInfo) {
            this.f = headerInfo;
            d();
        }
    }

    public final void d() {
        int i;
        int i2 = a.$EnumSwitchMapping$1[this.f.ordinal()];
        if (i2 == 1) {
            i = a.$EnumSwitchMapping$0[this.e.ordinal()] == 1 ? R.string.vkim_dialogs_header_filter_unread : R.string.vkim_dialogs_header_title_rename;
        } else if (i2 == 2) {
            i = R.string.vkim_sync_state_refreshing_dots;
        } else if (i2 == 3) {
            i = R.string.vkim_sync_state_wait_for_network_dots;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.string.vkim_sync_state_connecting_dots;
        }
        this.c.setText(i);
    }

    @Override // xsna.zqm
    public final void show() {
        d3m.c(this.b, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.zqm
    public final void a(int i, boolean z, boolean z2) {
    }
}
