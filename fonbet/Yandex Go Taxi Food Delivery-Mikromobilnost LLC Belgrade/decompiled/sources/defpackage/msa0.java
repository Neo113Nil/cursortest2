package defpackage;

/* loaded from: classes15.dex */
public final class msa0 extends y2o {
    public final /* synthetic */ int a;
    public final /* synthetic */ nsa0 b;

    public /* synthetic */ msa0(nsa0 nsa0Var, int i) {
        this.a = i;
        this.b = nsa0Var;
    }

    @Override // defpackage.y2o
    public final void a(ull0 ull0Var, Object obj) {
        int i = this.a;
        nsa0 nsa0Var = this.b;
        switch (i) {
            case 0:
                osa0 osa0Var = (osa0) obj;
                ull0Var.b(1, osa0Var.a);
                ull0Var.g1(2, osa0Var.b);
                ull0Var.g1(3, osa0Var.c);
                ull0Var.b(4, osa0Var.d);
                ull0Var.z(osa0Var.e, 5);
                String d = ((us10) nsa0Var.c.getValue()).d(osa0Var.f);
                if (d == null) {
                    ull0Var.p(6);
                } else {
                    ull0Var.g1(6, d);
                }
                String str = osa0Var.g;
                if (str == null) {
                    ull0Var.p(7);
                } else {
                    ull0Var.g1(7, str);
                }
                String d2 = nsa0Var.o().d(osa0Var.h);
                if (d2 == null) {
                    ull0Var.p(8);
                } else {
                    ull0Var.g1(8, d2);
                }
                ull0Var.b(9, osa0Var.i ? 1L : 0L);
                String d3 = ((dmo) nsa0Var.e.getValue()).d(osa0Var.j);
                if (d3 == null) {
                    ull0Var.p(10);
                } else {
                    ull0Var.g1(10, d3);
                }
                String str2 = osa0Var.k;
                if (str2 == null) {
                    ull0Var.p(11);
                } else {
                    ull0Var.g1(11, str2);
                }
                String d4 = ((okf) nsa0Var.f.getValue()).d(osa0Var.l);
                if (d4 == null) {
                    ull0Var.p(12);
                } else {
                    ull0Var.g1(12, d4);
                }
                String d5 = nsa0Var.o().d(osa0Var.m);
                if (d5 == null) {
                    ull0Var.p(13);
                } else {
                    ull0Var.g1(13, d5);
                }
                ull0Var.b(14, osa0Var.n ? 1L : 0L);
                ull0Var.g1(15, osa0Var.o);
                String d6 = ((kas) nsa0Var.g.getValue()).d(osa0Var.p);
                if (d6 == null) {
                    ull0Var.p(16);
                } else {
                    ull0Var.g1(16, d6);
                }
                ull0Var.b(17, osa0Var.q ? 1L : 0L);
                String str3 = osa0Var.r;
                if (str3 == null) {
                    ull0Var.p(18);
                } else {
                    ull0Var.g1(18, str3);
                }
                ull0Var.b(19, osa0Var.s ? 1L : 0L);
                String str4 = osa0Var.t;
                if (str4 != null) {
                    ull0Var.g1(20, str4);
                    break;
                } else {
                    ull0Var.p(20);
                    break;
                }
            default:
                wra0 wra0Var = (wra0) obj;
                ull0Var.g1(1, wra0Var.a);
                String d7 = ((r8b) nsa0Var.i.getValue()).d(wra0Var.b);
                if (d7 != null) {
                    ull0Var.g1(2, d7);
                    break;
                } else {
                    ull0Var.p(2);
                    break;
                }
        }
    }

    @Override // defpackage.y2o
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR ABORT INTO `pending_message_to_chat_request` (`message_order`,`message_chat_request_id`,`message_id`,`message_internal_id`,`message_time`,`message_data`,`message_attachment_uri`,`message_attachment_uris`,`message_force_as_file`,`message_existing_attachments`,`message_voice_file_uri`,`message_payload`,`message_mentioned_guids`,`message_is_paused`,`chat_source`,`message_forwards`,`is_starred`,`forced_translation`,`is_silent`,`quoted_text`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `pending_chat_requests` (`chat_request_id`,`chat_request_json`) VALUES (?,?)";
        }
    }
}
