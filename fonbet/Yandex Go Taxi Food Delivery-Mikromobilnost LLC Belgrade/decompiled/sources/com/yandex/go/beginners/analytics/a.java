package com.yandex.go.beginners.analytics;

import defpackage.dho;
import defpackage.o61;

/* loaded from: classes12.dex */
public final class a {
    public final o61 a;
    public final dho b;

    public a(o61 o61Var, dho dhoVar) {
        this.a = o61Var;
        this.b = dhoVar;
    }

    public final void a() {
        this.a.e(this.b.a(BeginnersAuthPostloadAnalytics$AuthPostload.Total) != null ? Double.valueOf(r0.floatValue()) : null, "BeginnersAuthPostload.completed");
    }

    public final void b() {
        this.a.e(this.b.a(BeginnersAuthPostloadAnalytics$AuthPostload.Launch) != null ? Double.valueOf(r0.floatValue()) : null, "BeginnersAuthPostload.launchError");
    }

    public final void c() {
        this.b.c(BeginnersAuthPostloadAnalytics$AuthPostload.Launch);
        o61 o61Var = this.a;
        o61Var.getClass();
        o61Var.e(null, "BeginnersAuthPostload.launchStarted");
    }

    public final void d() {
        this.a.e(this.b.a(BeginnersAuthPostloadAnalytics$AuthPostload.Launch) != null ? Double.valueOf(r0.floatValue()) : null, "BeginnersAuthPostload.launchSuccess");
    }

    public final void e() {
        this.a.e(this.b.a(BeginnersAuthPostloadAnalytics$AuthPostload.Launch) != null ? Double.valueOf(r0.floatValue()) : null, "BeginnersAuthPostload.launchTimeout");
    }

    public final void f() {
        this.a.e(this.b.a(BeginnersAuthPostloadAnalytics$AuthPostload.Products) != null ? Double.valueOf(r0.floatValue()) : null, "BeginnersAuthPostload.productsError");
    }

    public final void g() {
        this.b.c(BeginnersAuthPostloadAnalytics$AuthPostload.Products);
        o61 o61Var = this.a;
        o61Var.getClass();
        o61Var.e(null, "BeginnersAuthPostload.productsStarted");
    }

    public final void h() {
        this.a.e(this.b.a(BeginnersAuthPostloadAnalytics$AuthPostload.Products) != null ? Double.valueOf(r0.floatValue()) : null, "BeginnersAuthPostload.productsSuccess");
    }

    public final void i() {
        this.a.e(this.b.a(BeginnersAuthPostloadAnalytics$AuthPostload.Products) != null ? Double.valueOf(r0.floatValue()) : null, "BeginnersAuthPostload.productsTimeout");
    }

    public final void j() {
        this.b.c(BeginnersAuthPostloadAnalytics$AuthPostload.Total);
    }
}
