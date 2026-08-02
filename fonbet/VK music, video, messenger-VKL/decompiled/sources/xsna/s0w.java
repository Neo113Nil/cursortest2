package xsna;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.ui.components.dialogs_header.vc.HeaderInfo;
import com.vk.im.ui.views.MentionCounterView;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.r0w;

/* compiled from: ImDialogsHeaderVc.kt */
/* loaded from: classes2.dex */
public final class s0w implements zqm {
    public static final int m = iah0.a(24);
    public static final int n = iah0.a(12);
    public final int a;
    public r0w.a b;
    public View c;
    public TextView d;
    public Toolbar e;
    public ViewGroup f;
    public MentionCounterView g;
    public boolean h;
    public DialogsFilter i = DialogsFilter.MAIN;
    public HeaderInfo j = HeaderInfo.CONNECTING;
    public final Handler k = new Handler(Looper.getMainLooper());
    public Drawable l;

    /* compiled from: ImDialogsHeaderVc.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DialogsFilter.values().length];
            try {
                iArr[DialogsFilter.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DialogsFilter.UNREAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DialogsFilter.REQUESTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DialogsFilter.ARCHIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DialogsFilter.BUSINESS_NOTIFY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DialogsFilter.CHATS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HeaderInfo.values().length];
            try {
                iArr2[HeaderInfo.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[HeaderInfo.REFRESHING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[HeaderInfo.WAIT_FOR_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[HeaderInfo.CONNECTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public s0w(int i, boolean z, Integer num) {
        this.a = i;
    }

    @Override // xsna.zqm
    public final void a(int i, boolean z, boolean z2) {
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setVisibility(z ? 0 : 8);
        if (z2) {
            MentionCounterView mentionCounterView = this.g;
            if (mentionCounterView == null) {
                mentionCounterView = null;
            }
            mentionCounterView.i();
        } else {
            MentionCounterView mentionCounterView2 = this.g;
            if (mentionCounterView2 == null) {
                mentionCounterView2 = null;
            }
            mentionCounterView2.setCounter(i);
        }
        MentionCounterView mentionCounterView3 = this.g;
        (mentionCounterView3 != null ? mentionCounterView3 : null).setVisibility(z2 || i > 0 ? 0 : 8);
    }

    @Override // xsna.zqm
    public final void b(DialogsFilter dialogsFilter) {
        if (this.h) {
            this.i = dialogsFilter;
            switch (a.$EnumSwitchMapping$0[dialogsFilter.ordinal()]) {
                case 1:
                    TextView textView = this.d;
                    (textView != null ? textView : null).setText(R.string.vkim_dialogs_header_title_rename);
                    break;
                case 2:
                    TextView textView2 = this.d;
                    (textView2 != null ? textView2 : null).setText(R.string.vkim_dialogs_header_filter_unread);
                    break;
                case 3:
                case 5:
                case 6:
                    break;
                case 4:
                    TextView textView3 = this.d;
                    (textView3 != null ? textView3 : null).setText(R.string.vkim_dialogs_header_filter_archive);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            d();
        }
    }

    @Override // xsna.zqm
    public final void c(HeaderInfo headerInfo) {
        if (this.h && this.j != headerInfo) {
            this.j = headerInfo;
            d();
        }
    }

    public final void d() {
        int i;
        int i2 = a.$EnumSwitchMapping$1[this.j.ordinal()];
        int i3 = this.a;
        if (i2 == 1) {
            i = a.$EnumSwitchMapping$0[this.i.ordinal()] == 2 ? R.string.vkim_dialogs_header_filter_unread : i3;
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
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(i);
        if (i == i3) {
            TextView textView2 = this.d;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setCompoundDrawables(this.l, null, null, null);
            return;
        }
        TextView textView3 = this.d;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setCompoundDrawables(null, null, null, null);
    }

    @Override // xsna.zqm
    public final void show() {
        if (this.h) {
            View view = this.c;
            if (view == null) {
                view = null;
            }
            d3m.c(view, (r15 & 1) != 0 ? 300L : 100L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }
}
