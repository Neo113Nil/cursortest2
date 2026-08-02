package xsna;

import kotlin.Pair;

/* compiled from: DialogReadTillMergeTask.kt */
/* loaded from: classes2.dex */
public final class gjm extends b920 {
    public final long c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public gjm(long j, Integer num, Integer num2, Integer num3, int i) {
        num = (i & 2) != 0 ? null : num;
        num2 = (i & 4) != 0 ? null : num2;
        num3 = (i & 8) != 0 ? null : num3;
        this.c = j;
        this.d = num;
        this.e = num2;
        this.f = num3;
    }

    @Override // xsna.b920
    public final Object o(final w2w w2wVar) {
        Integer num = this.e;
        Integer num2 = this.d;
        if (num2 == null && num == null) {
            return Boolean.FALSE;
        }
        final boolean z = !k9q0.p(w2wVar) && w2wVar.H0().b == this.c;
        int max = Math.max(num2 != null ? num2.intValue() : 0, num != null ? num.intValue() : 0);
        if (z) {
            num2 = Integer.valueOf(max);
        }
        if (z) {
            num = Integer.valueOf(max);
        }
        Pair pair = new Pair(num2, num);
        final Integer num3 = (Integer) pair.d();
        final Integer num4 = (Integer) pair.g();
        return (Boolean) w2wVar.I0().u(new izs() { // from class: xsna.fjm
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                int S;
                gjm gjmVar = gjm.this;
                Integer num5 = gjmVar.f;
                final long j = gjmVar.c;
                Integer num6 = num3;
                w2w w2wVar2 = w2wVar;
                if (num5 == null) {
                    if (num6 != null) {
                        if (z) {
                            S = 0;
                        } else {
                            S = w2wVar2.I0().o().S(num6.intValue(), j);
                        }
                        num5 = Integer.valueOf(S);
                    } else {
                        num5 = null;
                    }
                }
                final hpm c = sn.c(w2wVar2);
                Integer num7 = num4;
                if (num6 != null && num7 != null) {
                    final int intValue = num6.intValue();
                    final int intValue2 = num7.intValue();
                    c.c.a(Long.valueOf(j), new izs() { // from class: xsna.epm
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj2, null, null, null, intValue, intValue2, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -97, 2097151);
                        }
                    }, new izs() { // from class: xsna.fpm
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            hpm.this.b.b().execSQL("UPDATE dialogs SET read_till_in_msg_cnv_id = ?, read_till_out_msg_cnv_id = ? WHERE id = ?", new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2), Long.valueOf(j)});
                            return s3q0.a;
                        }
                    });
                } else if (num6 != null) {
                    final int intValue3 = num6.intValue();
                    c.c.a(Long.valueOf(j), new rnm(intValue3, 0), new izs() { // from class: xsna.snm
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            c.b.b().execSQL("UPDATE dialogs SET read_till_in_msg_cnv_id = ? WHERE id = ?", new Object[]{Integer.valueOf(intValue3), Long.valueOf(j)});
                            return s3q0.a;
                        }
                    });
                } else if (num7 != null) {
                    final int intValue4 = num7.intValue();
                    c.c.a(Long.valueOf(j), new mnm(intValue4, 0), new izs() { // from class: xsna.nnm
                        @Override // xsna.izs
                        public final Object invoke(Object obj2) {
                            c.b.b().execSQL("UPDATE dialogs SET read_till_out_msg_cnv_id = ? WHERE id = ?", new Object[]{Integer.valueOf(intValue4), Long.valueOf(j)});
                            return s3q0.a;
                        }
                    });
                }
                if (num5 != null) {
                    sn.c(w2wVar2).n(num5.intValue(), j);
                }
                if (num6 != null) {
                    hpm c2 = sn.c(w2wVar2);
                    c2.c.a(Long.valueOf(j), new z2b(num6.intValue(), 1), new kpd(1, c2, hpm.class, "updateUnreadCnvMentions", "updateUnreadCnvMentions(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0, 5));
                }
                if (num6 != null) {
                    hpm c3 = sn.c(w2wVar2);
                    c3.c.a(Long.valueOf(j), new gpm(num6.intValue(), 0), new lp1(1, c3, hpm.class, "updateExpireCnvMsg", "updateExpireCnvMsg(Lcom/vk/im/engine/models/dialogs/DialogStorageModel;)V", 0, 6));
                }
                return Boolean.TRUE;
            }
        });
    }
}
