package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.tracker;

import com.yandex.fintechsdk.adapters.flex.sdk.impl.utils.DocumentQueryMappingKt;
import defpackage.i3m;
import defpackage.jxi;
import defpackage.l1o;
import defpackage.q370;
import defpackage.u1m;
import defpackage.uva0;
import defpackage.uyi0;
import defpackage.wbe0;
import defpackage.xg5;
import defpackage.xzl;
import defpackage.ywl;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u00120\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ9\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u00120\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u00120\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ;\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u00120\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJC\u0010\"\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0010\u0010\u0013\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u00120\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020 0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/tracker/DocumentTrackerImpl;", "Li3m;", "Lxg5;", "eventHandler", "Luyi0;", "renderingEventsListener", "<init>", "(Lxg5;Luyi0;)V", "Lxzl;", "documentFetchResult", "", "getDocumentName", "(Lxzl;)Ljava/lang/String;", "Ll1o;", "context", "Lu1m;", "query", "", "Lflex/tag/Tag;", "tags", "Lzy11;", "onDocumentLoadingStarted", "(Ll1o;Lu1m;Ljava/util/List;)V", "", "error", "onDocumentLoadingFailed", "(Ll1o;Lu1m;Ljava/lang/Throwable;Ljava/util/List;)V", "onDocumentLoadingCancelled", "(Ll1o;Lu1m;Ljava/util/List;Ljava/lang/Throwable;)V", "onDocumentLoadingFinished", "(Ll1o;Lu1m;Lxzl;Ljava/util/List;)V", "onRenderingStarted", "", "frameDrawnTimeNanos", "onRenderingFinished", "(Ll1o;Lu1m;Lxzl;JLjava/util/List;)V", "dispose", "()V", "Lxg5;", "Luyi0;", "Ljava/util/concurrent/ConcurrentHashMap;", "renderingStartTimes", "Ljava/util/concurrent/ConcurrentHashMap;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DocumentTrackerImpl implements i3m {
    private final xg5 eventHandler;
    private final uyi0 renderingEventsListener;
    private final ConcurrentHashMap<String, Long> renderingStartTimes = new ConcurrentHashMap<>();

    public DocumentTrackerImpl(xg5 xg5Var, uyi0 uyi0Var) {
        this.eventHandler = xg5Var;
        this.renderingEventsListener = uyi0Var;
    }

    private final String getDocumentName(xzl documentFetchResult) {
        b bVar;
        q370 q370Var = documentFetchResult.a.e;
        Object obj = q370Var != null ? q370Var.a : null;
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar == null || (bVar = (b) cVar.get("pageName")) == null) {
            return null;
        }
        return bVar.toString();
    }

    @Override // defpackage.i3m
    public void dispose() {
    }

    @Override // defpackage.i3m
    public /* bridge */ /* synthetic */ void onDocumentApplied(l1o l1oVar, xzl xzlVar, List list) {
        super.onDocumentApplied(l1oVar, xzlVar, list);
    }

    @Override // defpackage.i3m
    public void onDocumentLoadingCancelled(l1o context, u1m query, List<String> tags, Throwable error) {
        ((com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.b) this.eventHandler).b(DocumentQueryMappingKt.toBduiQuery(query));
    }

    @Override // defpackage.i3m
    public void onDocumentLoadingFailed(l1o context, u1m query, Throwable error, List<String> tags) {
        ((com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.b) this.eventHandler).c(DocumentQueryMappingKt.toBduiQuery(query));
    }

    @Override // defpackage.i3m
    public void onDocumentLoadingFinished(l1o context, u1m query, xzl documentFetchResult, List<String> tags) {
        ((com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.b) this.eventHandler).d(DocumentQueryMappingKt.toBduiQuery(query));
    }

    @Override // defpackage.i3m
    public void onDocumentLoadingStarted(l1o context, u1m query, List<String> tags) {
        ((com.yandex.fintechsdk.features.bdui.internal.presentation.fragment.b) this.eventHandler).e(DocumentQueryMappingKt.toBduiQuery(query));
    }

    @Override // defpackage.i3m
    public void onDocumentPause(l1o l1oVar, u1m u1mVar, List list) {
        onDocumentPause(l1oVar, u1mVar);
    }

    @Override // defpackage.i3m
    public void onDocumentResume(l1o l1oVar, u1m u1mVar, List list) {
        onDocumentResume(l1oVar, u1mVar);
    }

    @Override // defpackage.i3m
    public /* bridge */ /* synthetic */ void onPortionLoadingCancelled(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, List list, Throwable th) {
    }

    @Override // defpackage.i3m
    public /* bridge */ /* synthetic */ void onPortionLoadingFailed(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, Throwable th, List list) {
    }

    @Override // defpackage.i3m
    public /* bridge */ /* synthetic */ void onPortionLoadingFinished(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, ywl ywlVar, List list) {
    }

    @Override // defpackage.i3m
    public /* bridge */ /* synthetic */ void onPortionLoadingStarted(l1o l1oVar, u1m u1mVar, wbe0 wbe0Var, List list) {
    }

    @Override // defpackage.i3m
    public void onRenderingFinished(l1o context, u1m query, xzl documentFetchResult, long frameDrawnTimeNanos, List<String> tags) {
        String documentName;
        Long remove;
        if (((query == null || (documentName = query.a) == null) && (documentName = getDocumentName(documentFetchResult)) == null) || (remove = this.renderingStartTimes.remove(documentName)) == null) {
            return;
        }
        long nanoTime = (System.nanoTime() - remove.longValue()) / 1000000;
        uyi0 uyi0Var = this.renderingEventsListener;
        if (uyi0Var != null) {
            ((uva0) uyi0Var).c(nanoTime, documentName);
        }
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onRenderingFinishedLegacy(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j, List list) {
    }

    @Override // defpackage.i3m
    public void onRenderingStarted(l1o context, u1m query, xzl documentFetchResult, List<String> tags) {
        String documentName;
        if ((query == null || (documentName = query.a) == null) && (documentName = getDocumentName(documentFetchResult)) == null) {
            documentName = "";
        }
        this.renderingStartTimes.put(documentName, Long.valueOf(System.nanoTime()));
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onDocumentApplied(l1o l1oVar, ywl ywlVar) {
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onDocumentPause(l1o l1oVar, u1m u1mVar) {
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onDocumentResume(l1o l1oVar, u1m u1mVar) {
    }

    @Override // defpackage.i3m
    @jxi
    public void onDocumentApplied(l1o l1oVar, ywl ywlVar, List list) {
        onDocumentApplied(l1oVar, ywlVar);
    }

    @jxi
    public /* bridge */ /* synthetic */ void onDocumentLoadingCancelled(l1o l1oVar, u1m u1mVar, List list) {
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onDocumentLoadingFailed(l1o l1oVar, u1m u1mVar, Throwable th) {
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar) {
    }

    @Override // defpackage.i3m
    @jxi
    public void onDocumentLoadingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, List list) {
        onDocumentLoadingFinished(l1oVar, u1mVar, ywlVar);
    }

    @Override // defpackage.i3m
    public void onDocumentLoadingStarted(l1o l1oVar, u1m u1mVar, List list, ywl ywlVar) {
        onDocumentLoadingStarted(l1oVar, u1mVar, list);
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onRenderingStarted(l1o l1oVar, u1m u1mVar, ywl ywlVar) {
    }

    @Override // defpackage.i3m
    @jxi
    public void onRenderingStarted(l1o l1oVar, u1m u1mVar, ywl ywlVar, List list) {
        onRenderingStarted(l1oVar, u1mVar, ywlVar);
    }

    @Override // defpackage.i3m
    @jxi
    public /* bridge */ /* synthetic */ void onRenderingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j) {
    }

    @Override // defpackage.i3m
    @jxi
    public void onRenderingFinished(l1o l1oVar, u1m u1mVar, ywl ywlVar, long j, List list) {
        onRenderingFinished(l1oVar, u1mVar, ywlVar, j);
    }
}
