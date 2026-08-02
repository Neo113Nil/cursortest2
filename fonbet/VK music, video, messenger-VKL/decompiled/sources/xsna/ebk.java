package xsna;

import com.vkontakte.android.R;
import xsna.dbk;

/* compiled from: CreatedContactFailsSyncAlert.kt */
/* loaded from: classes2.dex */
public final class ebk extends dbk {
    public final int h1 = R.string.vkim_error_created_contact_sync_title;
    public final int i1 = R.string.vkim_error_created_contact_sync_desc;
    public final int j1 = R.string.vkim_error_created_contact_sync_button;

    /* compiled from: CreatedContactFailsSyncAlert.kt */
    public static final class a extends dbk.a {
        @Override // xsna.dw20.a
        public final dbk f() {
            return new ebk();
        }
    }

    @Override // xsna.dbk
    public final int Yn() {
        return this.j1;
    }

    @Override // xsna.dbk
    public final int Zn() {
        return this.i1;
    }

    @Override // xsna.dbk
    public final int ao() {
        return this.h1;
    }
}
