package defpackage;

import java.util.List;

/* loaded from: classes9.dex */
public interface i3m {
    void dispose();

    default void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        onDocumentApplied(l1oVar, xzlVar.a, list);
    }

    default void onDocumentLoadingCancelled(l1o l1oVar, u1m u1mVar, List list, Throwable th) {
    }

    default void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th, List list) {
        onDocumentLoadingFailed(l1oVar, u1mVar, th);
    }

    default void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        onDocumentLoadingFinished(l1oVar, u1mVar, xzlVar.a, list);
    }

    default void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list) {
        onDocumentLoadingStarted(l1oVar, u1mVar);
    }

    default void onDocumentPause(l1o l1oVar, u1m u1mVar, List list) {
        onDocumentPause(l1oVar, u1mVar);
    }

    default void onDocumentResume(l1o l1oVar, u1m u1mVar, List list) {
        onDocumentResume(l1oVar, u1mVar);
    }

    default void onPortionLoadingCancelled(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, List list, Throwable th) {
    }

    default void onPortionLoadingFailed(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, Throwable th, List list) {
    }

    default void onPortionLoadingFinished(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, ywl ywlVar, List list) {
    }

    default void onPortionLoadingStarted(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, List list) {
    }

    default void onRenderingFinished(l1o l1oVar, u1m u1mVar, xzl xzlVar, long j, List list) {
        onRenderingFinished(l1oVar, u1mVar, xzlVar.a, j, list);
    }

    default void onRenderingFinishedLegacy(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j, List list) {
    }

    default void onRenderingStarted(l1o l1oVar, u1m u1mVar, xzl xzlVar, List list) {
        onRenderingStarted(l1oVar, u1mVar, xzlVar.a, list);
    }

    default void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th) {
    }

    default void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar) {
    }

    default void onDocumentPause(l1o l1oVar, u1m u1mVar) {
    }

    default void onDocumentResume(l1o l1oVar, u1m u1mVar) {
    }

    default void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list, ywl ywlVar) {
        onDocumentLoadingStarted(l1oVar, u1mVar, list);
    }

    default void onDocumentApplied(l1o l1oVar, ywl ywlVar) {
    }

    default void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
    }

    default void onRenderingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j) {
    }

    default void onRenderingStarted(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
    }

    default void onDocumentApplied(l1o l1oVar, ywl ywlVar, List list) {
        onDocumentApplied(l1oVar, ywlVar);
    }

    default void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, List list) {
        onDocumentLoadingFinished(l1oVar, u1mVar, ywlVar);
    }

    default void onRenderingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j, List list) {
        onRenderingFinished(l1oVar, u1mVar, ywlVar, j);
    }

    default void onRenderingStarted(l1o l1oVar, u1m u1mVar, ywl ywlVar, List list) {
        onRenderingStarted(l1oVar, u1mVar, ywlVar);
    }
}
