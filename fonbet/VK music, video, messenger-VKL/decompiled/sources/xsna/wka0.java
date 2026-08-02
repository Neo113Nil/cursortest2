package xsna;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PictureParameterSet.java */
/* loaded from: classes13.dex */
public final class wka0 extends de {
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int[] s;
    public int[] t;
    public int[] u;
    public boolean v;
    public int[] w;
    public a x;

    /* compiled from: PictureParameterSet.java */
    public static class a {
        public boolean a;
        public yo9 b;
        public int c;

        public final String toString() {
            StringBuilder sb = new StringBuilder("PPSExt{transform_8x8_mode_flag=");
            sb.append(this.a);
            sb.append(", scalindMatrix=");
            sb.append(this.b);
            sb.append(", second_chroma_qp_index_offset=");
            return h5s.c(this.c, ", pic_scaling_list_present_flag=null}", sb);
        }
    }

    public static wka0 q0(ByteArrayInputStream byteArrayInputStream) throws IOException {
        uu8 uu8Var = new uu8(byteArrayInputStream);
        wka0 wka0Var = new wka0();
        wka0Var.f = uu8Var.f("PPS: pic_parameter_set_id");
        wka0Var.g = uu8Var.f("PPS: seq_parameter_set_id");
        wka0Var.b = uu8Var.b("PPS: entropy_coding_mode_flag");
        wka0Var.h = uu8Var.b("PPS: pic_order_present_flag");
        int f = uu8Var.f("PPS: num_slice_groups_minus1");
        wka0Var.i = f;
        if (f > 0) {
            int f2 = uu8Var.f("PPS: slice_group_map_type");
            wka0Var.j = f2;
            int i = wka0Var.i + 1;
            wka0Var.s = new int[i];
            wka0Var.t = new int[i];
            wka0Var.u = new int[i];
            if (f2 == 0) {
                for (int i2 = 0; i2 <= wka0Var.i; i2++) {
                    wka0Var.u[i2] = uu8Var.f("PPS: run_length_minus1");
                }
            } else if (f2 == 2) {
                for (int i3 = 0; i3 < wka0Var.i; i3++) {
                    wka0Var.s[i3] = uu8Var.f("PPS: top_left");
                    wka0Var.t[i3] = uu8Var.f("PPS: bottom_right");
                }
            } else if (f2 == 3 || f2 == 4 || f2 == 5) {
                wka0Var.v = uu8Var.b("PPS: slice_group_change_direction_flag");
                wka0Var.e = uu8Var.f("PPS: slice_group_change_rate_minus1");
            } else if (f2 == 6) {
                int i4 = i <= 4 ? i > 2 ? 2 : 1 : 3;
                int f3 = uu8Var.f("PPS: pic_size_in_map_units_minus1");
                wka0Var.w = new int[f3 + 1];
                for (int i5 = 0; i5 <= f3; i5++) {
                    wka0Var.w[i5] = (int) uu8Var.d(i4, "PPS: slice_group_id [" + i5 + "]f");
                }
            }
        }
        wka0Var.c = uu8Var.f("PPS: num_ref_idx_l0_active_minus1");
        wka0Var.d = uu8Var.f("PPS: num_ref_idx_l1_active_minus1");
        wka0Var.k = uu8Var.b("PPS: weighted_pred_flag");
        wka0Var.l = (int) uu8Var.d(2, "PPS: weighted_bipred_idc");
        wka0Var.m = uu8Var.e("PPS: pic_init_qp_minus26");
        wka0Var.n = uu8Var.e("PPS: pic_init_qs_minus26");
        wka0Var.o = uu8Var.e("PPS: chroma_qp_index_offset");
        wka0Var.p = uu8Var.b("PPS: deblocking_filter_control_present_flag");
        wka0Var.q = uu8Var.b("PPS: constrained_intra_pred_flag");
        wka0Var.r = uu8Var.b("PPS: redundant_pic_cnt_present_flag");
        if (uu8Var.d == 8) {
            uu8Var.b = uu8Var.c;
            uu8Var.c = uu8Var.a.read();
            uu8Var.d = 0;
        }
        int i6 = 1 << (7 - uu8Var.d);
        int i7 = uu8Var.b;
        boolean z = (((i6 << 1) - 1) & i7) == i6;
        if (i7 != -1 && (uu8Var.c != -1 || !z)) {
            a aVar = new a();
            aVar.b = new yo9();
            wka0Var.x = aVar;
            aVar.a = uu8Var.b("PPS: transform_8x8_mode_flag");
            if (uu8Var.b("PPS: pic_scaling_matrix_present_flag")) {
                for (int i8 = 0; i8 < ((wka0Var.x.a ? 1 : 0) * 2) + 6; i8++) {
                    if (uu8Var.b("PPS: pic_scaling_list_present_flag")) {
                        yo9 yo9Var = wka0Var.x.b;
                        e5h0[] e5h0VarArr = new e5h0[8];
                        yo9Var.c = e5h0VarArr;
                        e5h0[] e5h0VarArr2 = new e5h0[8];
                        yo9Var.d = e5h0VarArr2;
                        if (i8 < 6) {
                            e5h0VarArr[i8] = e5h0.a(uu8Var, 16);
                        } else {
                            e5h0VarArr2[i8 - 6] = e5h0.a(uu8Var, 64);
                        }
                    }
                }
            }
            wka0Var.x.c = uu8Var.e("PPS: second_chroma_qp_index_offset");
        }
        uu8Var.a();
        uu8Var.c(8 - uu8Var.d);
        return wka0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wka0.class != obj.getClass()) {
            return false;
        }
        wka0 wka0Var = (wka0) obj;
        if (!Arrays.equals(this.t, wka0Var.t) || this.o != wka0Var.o || this.q != wka0Var.q || this.p != wka0Var.p || this.b != wka0Var.b) {
            return false;
        }
        a aVar = this.x;
        if (aVar == null) {
            if (wka0Var.x != null) {
                return false;
            }
        } else if (!aVar.equals(wka0Var.x)) {
            return false;
        }
        return this.c == wka0Var.c && this.d == wka0Var.d && this.i == wka0Var.i && this.m == wka0Var.m && this.n == wka0Var.n && this.h == wka0Var.h && this.f == wka0Var.f && this.r == wka0Var.r && Arrays.equals(this.u, wka0Var.u) && this.g == wka0Var.g && this.v == wka0Var.v && this.e == wka0Var.e && Arrays.equals(this.w, wka0Var.w) && this.j == wka0Var.j && Arrays.equals(this.s, wka0Var.s) && this.l == wka0Var.l && this.k == wka0Var.k;
    }

    public final int hashCode() {
        int d = (((((((dq.d(31, 31, this.t) + this.o) * 31) + (this.q ? 1231 : 1237)) * 31) + (this.p ? 1231 : 1237)) * 31) + (this.b ? 1231 : 1237)) * 31;
        a aVar = this.x;
        return ((dq.d((dq.d((((((dq.d((((((((((((((((((d + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.c) * 31) + this.d) * 31) + this.i) * 31) + this.m) * 31) + this.n) * 31) + (this.h ? 1231 : 1237)) * 31) + this.f) * 31) + (this.r ? 1231 : 1237)) * 31, 31, this.u) + this.g) * 31) + (this.v ? 1231 : 1237)) * 31) + this.e) * 31, 31, this.w) + this.j) * 31, 31, this.s) + this.l) * 31) + (this.k ? 1231 : 1237);
    }

    public final String toString() {
        return "PictureParameterSet{\n       entropy_coding_mode_flag=" + this.b + ",\n       num_ref_idx_l0_active_minus1=" + this.c + ",\n       num_ref_idx_l1_active_minus1=" + this.d + ",\n       slice_group_change_rate_minus1=" + this.e + ",\n       pic_parameter_set_id=" + this.f + ",\n       seq_parameter_set_id=" + this.g + ",\n       pic_order_present_flag=" + this.h + ",\n       num_slice_groups_minus1=" + this.i + ",\n       slice_group_map_type=" + this.j + ",\n       weighted_pred_flag=" + this.k + ",\n       weighted_bipred_idc=" + this.l + ",\n       pic_init_qp_minus26=" + this.m + ",\n       pic_init_qs_minus26=" + this.n + ",\n       chroma_qp_index_offset=" + this.o + ",\n       deblocking_filter_control_present_flag=" + this.p + ",\n       constrained_intra_pred_flag=" + this.q + ",\n       redundant_pic_cnt_present_flag=" + this.r + ",\n       top_left=" + this.s + ",\n       bottom_right=" + this.t + ",\n       run_length_minus1=" + this.u + ",\n       slice_group_change_direction_flag=" + this.v + ",\n       slice_group_id=" + this.w + ",\n       extended=" + this.x + '}';
    }
}
