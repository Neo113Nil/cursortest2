package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.contacts.ContactSyncState;
import com.vkontakte.android.R;

/* compiled from: NoContactsVhOld.kt */
/* loaded from: classes2.dex */
public final class p270 extends vfz<m270> {
    public final l270 l;
    public final View m;
    public final TextView n;
    public final TextView o;
    public final TextView p;
    public m270 q;

    /* compiled from: NoContactsVhOld.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContactSyncState.values().length];
            try {
                iArr[ContactSyncState.PERMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContactSyncState.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactSyncState.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContactSyncState.SYNCING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContactSyncState.FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContactSyncState.UNSUPPORTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public p270(View view, l270 l270Var) {
        super(view);
        this.l = l270Var;
        this.m = this.itemView.findViewById(R.id.vkim_progress);
        this.n = (TextView) this.itemView.findViewById(R.id.vkim_contacts_no_contacts);
        this.o = (TextView) this.itemView.findViewById(R.id.vkim_contacts_no_permission_label);
        TextView textView = (TextView) this.itemView.findViewById(R.id.vkim_content);
        this.p = textView;
        bwt0.i0(textView, new o010(this, 17));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(m270 m270Var) {
        m270 m270Var2 = m270Var;
        this.q = m270Var2;
        int i = a.$EnumSwitchMapping$0[m270Var2.b.ordinal()];
        TextView textView = this.n;
        View view = this.m;
        TextView textView2 = this.o;
        TextView textView3 = this.p;
        switch (i) {
            case 1:
            case 2:
            case 3:
                textView2.setText(R.string.vkim_contacts_no_contacts_at_all);
                textView.setVisibility(0);
                f4m.j(view);
                textView3.setText(R.string.vkim_contacts_add_contact);
                textView3.setVisibility(4);
                break;
            case 4:
                textView2.setText(R.string.vkim_contacts_syncing);
                textView.setVisibility(0);
                view.setVisibility(0);
                textView3.setVisibility(4);
                break;
            case 5:
                textView2.setText(R.string.vkim_contact_request_permission_label_failed);
                textView.setVisibility(0);
                f4m.j(view);
                textView3.setText(R.string.vkim_contacts_sync_failed);
                textView3.setVisibility(0);
                break;
            case 6:
                textView2.setText(R.string.vkim_contacts_empty_and_unsupported);
                f4m.j(textView);
                f4m.j(view);
                f4m.j(textView3);
                break;
            default:
                textView2.setText(R.string.vkim_contacts_no_permission_label);
                f4m.j(view);
                textView.setVisibility(0);
                textView3.setText(R.string.vkim_contacts_allow_contacts_permission);
                textView3.setVisibility(0);
                break;
        }
    }
}
