package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class clb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ clb(String str, String str2, int i) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        qyg0 V0;
        switch (this.b) {
            case 0:
                String str = this.c;
                String str2 = this.d;
                V0 = ((hyg0) obj).V0("SELECT progress_time FROM audio_book_chapter WHERE uid = ? AND chapter_id = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    Integer num = null;
                    if (V0.step() && !V0.isNull(0)) {
                        num = Integer.valueOf((int) V0.getLong(0));
                    }
                    return num;
                } finally {
                }
            default:
                String str3 = this.c;
                String str4 = this.d;
                V0 = ((hyg0) obj).V0("\n        SELECT COUNT(*) \n        FROM podcast_to_episodes \n        WHERE uid = ? AND podcast_owner_id = ?\n    ");
                try {
                    V0.D3(1, str3);
                    V0.D3(2, str4);
                    int i = V0.step() ? (int) V0.getLong(0) : 0;
                    V0.close();
                    return Integer.valueOf(i);
                } finally {
                }
        }
    }
}
