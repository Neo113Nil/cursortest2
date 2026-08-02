package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;

/* compiled from: VhTitleHeader.kt */
/* loaded from: classes7.dex */
public final class pvr0 extends jqr0<CallSettingsItem.TitleHeader> {
    public static final /* synthetic */ int s = 0;
    public final fuw0 l;
    public CallSettingsItem.TitleHeader m;
    public com.vk.movika.sdk.base.observable.a n;
    public final TextView o;
    public final TextView p;
    public final TextView q;
    public final View r;

    /* compiled from: VhTitleHeader.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallSettingsItem.TitleHeader.Title.values().length];
            try {
                iArr[CallSettingsItem.TitleHeader.Title.WAITING_ROOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallSettingsItem.TitleHeader.Title.CHAT_MEMBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallSettingsItem.TitleHeader.Title.FRIENDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CallSettingsItem.TitleHeader.Title.SUBSCRIBERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CallSettingsItem.TitleHeader.Title.CONTACTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CallSettingsItem.TitleHeader.Subtitle.values().length];
            try {
                iArr2[CallSettingsItem.TitleHeader.Subtitle.SHOW_LAST_MESSAGES.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CallSettingsItem.TitleHeader.Subtitle.CONTACT_BOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public pvr0(View view) {
        super(view);
        this.l = fuw0.a;
        this.o = (TextView) this.itemView.findViewById(R.id.title);
        this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
        this.q = (TextView) this.itemView.findViewById(R.id.counter);
        View findViewById = this.itemView.findViewById(R.id.button);
        this.r = findViewById;
        jjc.g(findViewById, new cim0(this, 7));
    }

    @Override // xsna.jqr0
    public final void V5() {
        this.m = null;
        this.n = null;
    }
}
