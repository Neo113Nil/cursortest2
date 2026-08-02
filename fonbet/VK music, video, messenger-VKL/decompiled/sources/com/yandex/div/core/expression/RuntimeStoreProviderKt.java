package com.yandex.div.core.expression;

import com.yandex.div2.md;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RuntimeStoreProvider.kt */
/* loaded from: classes7.dex */
public final class RuntimeStoreProviderKt {
    public static final String getName(md mdVar) {
        if (mdVar instanceof md.b) {
            return ((md.b) mdVar).b.a;
        }
        if (mdVar instanceof md.e) {
            return ((md.e) mdVar).b.a;
        }
        if (mdVar instanceof md.f) {
            return ((md.f) mdVar).b.a;
        }
        if (mdVar instanceof md.h) {
            return ((md.h) mdVar).b.a;
        }
        if (mdVar instanceof md.c) {
            return ((md.c) mdVar).b.a;
        }
        if (mdVar instanceof md.i) {
            return ((md.i) mdVar).b.a;
        }
        if (mdVar instanceof md.d) {
            return ((md.d) mdVar).b.a;
        }
        if (mdVar instanceof md.a) {
            return ((md.a) mdVar).b.a;
        }
        if (mdVar instanceof md.g) {
            return ((md.g) mdVar).b.b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
