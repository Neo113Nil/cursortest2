package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vkontakte.android.R;

/* compiled from: FriendsCleanupDescriptionHeaderHolder.kt */
/* loaded from: classes15.dex */
public final class sms extends vfz {
    public final /* synthetic */ int l;
    public final TextView m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sms(ViewGroup viewGroup, int i) {
        super(R.layout.friends_cleanup_description_item, viewGroup);
        this.l = i;
        switch (i) {
            case 1:
                super(R.layout.sticker_suggest_list_header_item, viewGroup);
                this.m = (TextView) this.itemView.findViewById(R.id.title);
                break;
            default:
                this.m = (TextView) this.itemView.findViewById(R.id.friends_cleanup_description);
                break;
        }
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        switch (this.l) {
            case 0:
                this.m.setText(((bns) hfzVar).b);
                break;
            default:
                this.m.setText(((kxu) hfzVar).c);
                break;
        }
    }
}
