package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Arrays;
import yads.n02;
import yads.wy1;

/* loaded from: classes7.dex */
public class ip31 implements o671, vj81 {
    public View a;

    public /* synthetic */ ip31(View view) {
        this.a = view;
    }

    @Override // defpackage.o671
    public String a() {
        return String.format("supports: {inlineVideo: %s}", Arrays.copyOf(new Object[]{Boolean.valueOf(this.a.isHardwareAccelerated())}, 1));
    }

    @Override // defpackage.vj81
    public void b(fj71 fj71Var, jq81 jq81Var) {
        View view = this.a;
        Context context = view.getContext();
        o081 o081Var = jq81Var.c;
        mt81 mt81Var = o081Var.a;
        uy71 uy71Var = jq81Var.a;
        b181 b181Var = jq81Var.b;
        iz71 iz71Var = jq81Var.d;
        bl61 bl61Var = jq81Var.e;
        mt81Var.getClass();
        n02 n02Var = new n02(context, new wy1(uy71Var, b181Var, o081Var, iz71Var, fj71Var, bl61Var));
        view.setOnTouchListener(n02Var);
        view.setOnClickListener(n02Var);
    }

    public void c(View.OnLayoutChangeListener onLayoutChangeListener) {
        this.a.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    public int d() {
        return this.a.getBottom();
    }

    public int e() {
        return this.a.getHeight();
    }

    public int f() {
        return this.a.getLeft();
    }

    public int g() {
        return this.a.getRight();
    }

    public int h() {
        return this.a.getTop();
    }

    public int i() {
        return this.a.getWidth();
    }

    public void j(View.OnLayoutChangeListener onLayoutChangeListener) {
        this.a.removeOnLayoutChangeListener(onLayoutChangeListener);
    }
}
