package xsna;

import com.ironsource.X3;
import java.io.IOException;
import xsna.hir0;

/* compiled from: SeqParameterSet.java */
/* loaded from: classes13.dex */
public final class tki0 extends de {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int[] H;
    public hir0 I;
    public yo9 J;
    public int K;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public vbc f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public static tki0 q0(khc khcVar) throws IOException {
        uu8 uu8Var = new uu8(khcVar);
        tki0 tki0Var = new tki0();
        tki0Var.n = (int) uu8Var.d(8, "SPS: profile_idc");
        tki0Var.o = uu8Var.b("SPS: constraint_set_0_flag");
        tki0Var.p = uu8Var.b("SPS: constraint_set_1_flag");
        tki0Var.q = uu8Var.b("SPS: constraint_set_2_flag");
        tki0Var.r = uu8Var.b("SPS: constraint_set_3_flag");
        tki0Var.s = uu8Var.b("SPS: constraint_set_4_flag");
        tki0Var.t = uu8Var.b("SPS: constraint_set_5_flag");
        uu8Var.d(2, "SPS: reserved_zero_2bits");
        tki0Var.u = (int) uu8Var.d(8, "SPS: level_idc");
        tki0Var.v = uu8Var.f("SPS: seq_parameter_set_id");
        int i = tki0Var.n;
        vbc vbcVar = vbc.e;
        if (i == 100 || i == 110 || i == 122 || i == 144) {
            int f = uu8Var.f("SPS: chroma_format_idc");
            vbc vbcVar2 = vbc.g;
            if (f == 0) {
                vbcVar = vbc.d;
            } else if (f != 1) {
                vbcVar = f == 2 ? vbc.f : f == 3 ? vbcVar2 : null;
            }
            tki0Var.f = vbcVar;
            if (vbcVar == vbcVar2) {
                tki0Var.w = uu8Var.b("SPS: residual_color_transform_flag");
            }
            tki0Var.k = uu8Var.f("SPS: bit_depth_luma_minus8");
            tki0Var.l = uu8Var.f("SPS: bit_depth_chroma_minus8");
            tki0Var.m = uu8Var.b("SPS: qpprime_y_zero_transform_bypass_flag");
            if (uu8Var.b("SPS: seq_scaling_matrix_present_lag")) {
                tki0Var.J = new yo9();
                for (int i2 = 0; i2 < 8; i2++) {
                    if (uu8Var.b("SPS: seqScalingListPresentFlag")) {
                        yo9 yo9Var = tki0Var.J;
                        e5h0[] e5h0VarArr = new e5h0[8];
                        yo9Var.c = e5h0VarArr;
                        e5h0[] e5h0VarArr2 = new e5h0[8];
                        yo9Var.d = e5h0VarArr2;
                        if (i2 < 6) {
                            e5h0VarArr[i2] = e5h0.a(uu8Var, 16);
                        } else {
                            e5h0VarArr2[i2 - 6] = e5h0.a(uu8Var, 64);
                        }
                    }
                }
            }
        } else {
            tki0Var.f = vbcVar;
        }
        tki0Var.g = uu8Var.f("SPS: log2_max_frame_num_minus4");
        int f2 = uu8Var.f("SPS: pic_order_cnt_type");
        tki0Var.b = f2;
        if (f2 == 0) {
            tki0Var.h = uu8Var.f("SPS: log2_max_pic_order_cnt_lsb_minus4");
        } else if (f2 == 1) {
            tki0Var.c = uu8Var.b("SPS: delta_pic_order_always_zero_flag");
            tki0Var.x = uu8Var.e("SPS: offset_for_non_ref_pic");
            tki0Var.y = uu8Var.e("SPS: offset_for_top_to_bottom_field");
            int f3 = uu8Var.f("SPS: num_ref_frames_in_pic_order_cnt_cycle");
            tki0Var.K = f3;
            tki0Var.H = new int[f3];
            for (int i3 = 0; i3 < tki0Var.K; i3++) {
                tki0Var.H[i3] = uu8Var.e("SPS: offsetForRefFrame [" + i3 + X3.j.e);
            }
        }
        tki0Var.z = uu8Var.f("SPS: num_ref_frames");
        tki0Var.A = uu8Var.b("SPS: gaps_in_frame_num_value_allowed_flag");
        tki0Var.j = uu8Var.f("SPS: pic_width_in_mbs_minus1");
        tki0Var.i = uu8Var.f("SPS: pic_height_in_map_units_minus1");
        boolean b = uu8Var.b("SPS: frame_mbs_only_flag");
        tki0Var.B = b;
        if (!b) {
            tki0Var.d = uu8Var.b("SPS: mb_adaptive_frame_field_flag");
        }
        tki0Var.e = uu8Var.b("SPS: direct_8x8_inference_flag");
        boolean b2 = uu8Var.b("SPS: frame_cropping_flag");
        tki0Var.C = b2;
        if (b2) {
            tki0Var.D = uu8Var.f("SPS: frame_crop_left_offset");
            tki0Var.E = uu8Var.f("SPS: frame_crop_right_offset");
            tki0Var.F = uu8Var.f("SPS: frame_crop_top_offset");
            tki0Var.G = uu8Var.f("SPS: frame_crop_bottom_offset");
        }
        if (uu8Var.b("SPS: vui_parameters_present_flag")) {
            hir0 hir0Var = new hir0();
            boolean b3 = uu8Var.b("VUI: aspect_ratio_info_present_flag");
            hir0Var.a = b3;
            if (b3) {
                int d = (int) uu8Var.d(8, "VUI: aspect_ratio");
                nu3 nu3Var = nu3.b;
                nu3 nu3Var2 = d == 255 ? nu3Var : new nu3(d);
                hir0Var.y = nu3Var2;
                if (nu3Var2 == nu3Var) {
                    hir0Var.b = (int) uu8Var.d(16, "VUI: sar_width");
                    hir0Var.c = (int) uu8Var.d(16, "VUI: sar_height");
                }
            }
            boolean b4 = uu8Var.b("VUI: overscan_info_present_flag");
            hir0Var.d = b4;
            if (b4) {
                hir0Var.e = uu8Var.b("VUI: overscan_appropriate_flag");
            }
            boolean b5 = uu8Var.b("VUI: video_signal_type_present_flag");
            hir0Var.f = b5;
            if (b5) {
                hir0Var.g = (int) uu8Var.d(3, "VUI: video_format");
                hir0Var.h = uu8Var.b("VUI: video_full_range_flag");
                boolean b6 = uu8Var.b("VUI: colour_description_present_flag");
                hir0Var.i = b6;
                if (b6) {
                    hir0Var.j = (int) uu8Var.d(8, "VUI: colour_primaries");
                    hir0Var.k = (int) uu8Var.d(8, "VUI: transfer_characteristics");
                    hir0Var.l = (int) uu8Var.d(8, "VUI: matrix_coefficients");
                }
            }
            boolean b7 = uu8Var.b("VUI: chroma_loc_info_present_flag");
            hir0Var.m = b7;
            if (b7) {
                hir0Var.n = uu8Var.f("VUI chroma_sample_loc_type_top_field");
                hir0Var.o = uu8Var.f("VUI chroma_sample_loc_type_bottom_field");
            }
            boolean b8 = uu8Var.b("VUI: timing_info_present_flag");
            hir0Var.p = b8;
            if (b8) {
                hir0Var.q = (int) uu8Var.d(32, "VUI: num_units_in_tick");
                hir0Var.r = (int) uu8Var.d(32, "VUI: time_scale");
                hir0Var.s = uu8Var.b("VUI: fixed_frame_rate_flag");
            }
            boolean b9 = uu8Var.b("VUI: nal_hrd_parameters_present_flag");
            if (b9) {
                hir0Var.v = r0(uu8Var);
            }
            boolean b10 = uu8Var.b("VUI: vcl_hrd_parameters_present_flag");
            if (b10) {
                hir0Var.w = r0(uu8Var);
            }
            if (b9 || b10) {
                hir0Var.t = uu8Var.b("VUI: low_delay_hrd_flag");
            }
            hir0Var.u = uu8Var.b("VUI: pic_struct_present_flag");
            if (uu8Var.b("VUI: bitstream_restriction_flag")) {
                hir0.a aVar = new hir0.a();
                hir0Var.x = aVar;
                aVar.a = uu8Var.b("VUI: motion_vectors_over_pic_boundaries_flag");
                hir0Var.x.b = uu8Var.f("VUI max_bytes_per_pic_denom");
                hir0Var.x.c = uu8Var.f("VUI max_bits_per_mb_denom");
                hir0Var.x.d = uu8Var.f("VUI log2_max_mv_length_horizontal");
                hir0Var.x.e = uu8Var.f("VUI log2_max_mv_length_vertical");
                hir0Var.x.f = uu8Var.f("VUI num_reorder_frames");
                hir0Var.x.g = uu8Var.f("VUI max_dec_frame_buffering");
            }
            tki0Var.I = hir0Var;
        }
        uu8Var.a();
        uu8Var.c(8 - uu8Var.d);
        return tki0Var;
    }

    public static osu r0(uu8 uu8Var) throws IOException {
        osu osuVar = new osu();
        osuVar.a = uu8Var.f("SPS: cpb_cnt_minus1");
        osuVar.b = (int) uu8Var.d(4, "HRD: bit_rate_scale");
        osuVar.c = (int) uu8Var.d(4, "HRD: cpb_size_scale");
        int i = osuVar.a + 1;
        osuVar.d = new int[i];
        osuVar.e = new int[i];
        osuVar.f = new boolean[i];
        for (int i2 = 0; i2 <= osuVar.a; i2++) {
            osuVar.d[i2] = uu8Var.f("HRD: bit_rate_value_minus1");
            osuVar.e[i2] = uu8Var.f("HRD: cpb_size_value_minus1");
            osuVar.f[i2] = uu8Var.b("HRD: cbr_flag");
        }
        osuVar.g = (int) uu8Var.d(5, "HRD: initial_cpb_removal_delay_length_minus1");
        osuVar.h = (int) uu8Var.d(5, "HRD: cpb_removal_delay_length_minus1");
        osuVar.i = (int) uu8Var.d(5, "HRD: dpb_output_delay_length_minus1");
        osuVar.j = (int) uu8Var.d(5, "HRD: time_offset_length");
        return osuVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SeqParameterSet{ \n        pic_order_cnt_type=");
        sb.append(this.b);
        sb.append(", \n        field_pic_flag=false, \n        delta_pic_order_always_zero_flag=");
        sb.append(this.c);
        sb.append(", \n        weighted_pred_flag=false, \n        weighted_bipred_idc=0, \n        entropy_coding_mode_flag=false, \n        mb_adaptive_frame_field_flag=");
        sb.append(this.d);
        sb.append(", \n        direct_8x8_inference_flag=");
        sb.append(this.e);
        sb.append(", \n        chroma_format_idc=");
        sb.append(this.f);
        sb.append(", \n        log2_max_frame_num_minus4=");
        sb.append(this.g);
        sb.append(", \n        log2_max_pic_order_cnt_lsb_minus4=");
        sb.append(this.h);
        sb.append(", \n        pic_height_in_map_units_minus1=");
        sb.append(this.i);
        sb.append(", \n        pic_width_in_mbs_minus1=");
        sb.append(this.j);
        sb.append(", \n        bit_depth_luma_minus8=");
        sb.append(this.k);
        sb.append(", \n        bit_depth_chroma_minus8=");
        sb.append(this.l);
        sb.append(", \n        qpprime_y_zero_transform_bypass_flag=");
        sb.append(this.m);
        sb.append(", \n        profile_idc=");
        sb.append(this.n);
        sb.append(", \n        constraint_set_0_flag=");
        sb.append(this.o);
        sb.append(", \n        constraint_set_1_flag=");
        sb.append(this.p);
        sb.append(", \n        constraint_set_2_flag=");
        sb.append(this.q);
        sb.append(", \n        constraint_set_3_flag=");
        sb.append(this.r);
        sb.append(", \n        constraint_set_4_flag=");
        sb.append(this.s);
        sb.append(", \n        constraint_set_5_flag=");
        sb.append(this.t);
        sb.append(", \n        level_idc=");
        sb.append(this.u);
        sb.append(", \n        seq_parameter_set_id=");
        sb.append(this.v);
        sb.append(", \n        residual_color_transform_flag=");
        sb.append(this.w);
        sb.append(", \n        offset_for_non_ref_pic=");
        sb.append(this.x);
        sb.append(", \n        offset_for_top_to_bottom_field=");
        sb.append(this.y);
        sb.append(", \n        num_ref_frames=");
        sb.append(this.z);
        sb.append(", \n        gaps_in_frame_num_value_allowed_flag=");
        sb.append(this.A);
        sb.append(", \n        frame_mbs_only_flag=");
        sb.append(this.B);
        sb.append(", \n        frame_cropping_flag=");
        sb.append(this.C);
        sb.append(", \n        frame_crop_left_offset=");
        sb.append(this.D);
        sb.append(", \n        frame_crop_right_offset=");
        sb.append(this.E);
        sb.append(", \n        frame_crop_top_offset=");
        sb.append(this.F);
        sb.append(", \n        frame_crop_bottom_offset=");
        sb.append(this.G);
        sb.append(", \n        offsetForRefFrame=");
        sb.append(this.H);
        sb.append(", \n        vuiParams=");
        sb.append(this.I);
        sb.append(", \n        scalingMatrix=");
        sb.append(this.J);
        sb.append(", \n        num_ref_frames_in_pic_order_cnt_cycle=");
        return vu5.b(sb, this.K, '}');
    }
}
