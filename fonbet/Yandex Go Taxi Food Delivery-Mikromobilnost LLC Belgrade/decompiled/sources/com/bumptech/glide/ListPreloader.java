package com.bumptech.glide;

import android.widget.AbsListView;
import defpackage.jty;
import defpackage.kty;
import defpackage.lty;
import defpackage.mty;
import defpackage.p5j0;
import defpackage.ph91;
import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes10.dex */
public class ListPreloader<T> implements AbsListView.OnScrollListener {
    private int lastEnd;
    private int lastStart;
    private final int maxPreload;
    private final kty preloadDimensionProvider;
    private final jty preloadModelProvider;
    private final mty preloadTargetQueue;
    private final RequestManager requestManager;
    private int totalItemCount;
    private int lastFirstVisible = -1;
    private boolean isIncreasing = true;

    public ListPreloader(RequestManager requestManager, jty jtyVar, kty ktyVar, int i) {
        this.requestManager = requestManager;
        this.preloadModelProvider = jtyVar;
        this.preloadDimensionProvider = ktyVar;
        this.maxPreload = i;
        this.preloadTargetQueue = new mty(i + 1);
    }

    private void cancelAll() {
        for (int i = 0; i < this.preloadTargetQueue.a.size(); i++) {
            RequestManager requestManager = this.requestManager;
            ArrayDeque arrayDeque = this.preloadTargetQueue.a;
            lty ltyVar = (lty) arrayDeque.poll();
            arrayDeque.offer(ltyVar);
            ltyVar.b = 0;
            ltyVar.a = 0;
            requestManager.clear(ltyVar);
        }
    }

    private void preload(int i, int i2) {
        int min;
        int i3;
        if (i < i2) {
            i3 = Math.max(this.lastEnd, i);
            min = i2;
        } else {
            min = Math.min(this.lastStart, i);
            i3 = i2;
        }
        int min2 = Math.min(this.totalItemCount, min);
        int min3 = Math.min(this.totalItemCount, Math.max(0, i3));
        if (i < i2) {
            for (int i4 = min3; i4 < min2; i4++) {
                preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(i4), i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                preloadAdapterPosition(this.preloadModelProvider.getPreloadItems(i5), i5, false);
            }
        }
        this.lastStart = min3;
        this.lastEnd = min2;
    }

    private void preloadAdapterPosition(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                preloadItem(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            preloadItem(list.get(i3), i, i3);
        }
    }

    private void preloadItem(T t, int i, int i2) {
        int[] preloadSize;
        p5j0 preloadRequestBuilder;
        if (t == null || (preloadSize = this.preloadDimensionProvider.getPreloadSize(t, i, i2)) == null || (preloadRequestBuilder = this.preloadModelProvider.getPreloadRequestBuilder(t)) == null) {
            return;
        }
        mty mtyVar = this.preloadTargetQueue;
        int i3 = preloadSize[0];
        int i4 = preloadSize[1];
        ArrayDeque arrayDeque = mtyVar.a;
        lty ltyVar = (lty) arrayDeque.poll();
        arrayDeque.offer(ltyVar);
        ltyVar.b = i3;
        ltyVar.a = i4;
        preloadRequestBuilder.F(ltyVar, null, preloadRequestBuilder, ph91.a);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.totalItemCount == 0 && i3 == 0) {
            return;
        }
        this.totalItemCount = i3;
        int i4 = this.lastFirstVisible;
        if (i > i4) {
            preload(i2 + i, true);
        } else if (i < i4) {
            preload(i, false);
        }
        this.lastFirstVisible = i;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }

    private void preload(int i, boolean z) {
        if (this.isIncreasing != z) {
            this.isIncreasing = z;
            cancelAll();
        }
        int i2 = this.maxPreload;
        if (!z) {
            i2 = -i2;
        }
        preload(i, i2 + i);
    }
}
