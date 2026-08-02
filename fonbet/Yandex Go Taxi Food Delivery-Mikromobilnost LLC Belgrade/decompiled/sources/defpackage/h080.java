package defpackage;

/* loaded from: classes6.dex */
public final class h080 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;

    public h080(zuj0 zuj0Var) {
        avj0 avj0Var = (avj0) zuj0Var;
        this.a = avj0Var.c(usg0.statebar_height);
        avj0Var.c(bsg0.order_focus_rect_min_bottom);
        int c = avj0Var.c(bsg0.map_objects_top_offset);
        this.b = c;
        this.c = avj0Var.c(bsg0.map_objects_side_offset);
        int c2 = avj0Var.c(bsg0.map_objects_bottom_offset);
        this.d = c2;
        this.e = avj0Var.c(bsg0.cars_on_search_top_offset);
        this.f = avj0Var.c(bsg0.cars_on_search_side_offset);
        this.g = avj0Var.c(bsg0.cars_on_search_bottom_offset);
        this.h = tje.u(96, avj0Var.a);
        this.i = avj0Var.c(bsg0.bubble_full_height) + c;
        this.j = avj0Var.c(bsg0.map_object_bubble_full_height) + c2;
        this.k = avj0Var.c(bsg0.order_altpin_a_on_driving_side_offset);
        this.l = avj0Var.c(bsg0.order_details_min_focus_height);
        this.m = avj0Var.c(bsg0.order_list_min_focus_height);
    }
}
