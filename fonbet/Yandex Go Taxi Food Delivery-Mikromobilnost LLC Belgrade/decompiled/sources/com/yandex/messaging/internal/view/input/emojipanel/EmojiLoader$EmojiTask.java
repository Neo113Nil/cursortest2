package com.yandex.messaging.internal.view.input.emojipanel;

import android.graphics.Paint;
import android.os.AsyncTask;
import android.text.Spannable;
import android.util.LruCache;
import androidx.emoji2.text.EmojiSpan;
import defpackage.e1k;
import defpackage.ftn;
import defpackage.otn;
import defpackage.ptn;
import java.util.Objects;

/* loaded from: classes15.dex */
final class EmojiLoader$EmojiTask extends AsyncTask<Void, Void, otn> implements e1k {
    private final LruCache<String, otn> mCache;
    private final int mDrawAreaHeight;
    private String mEmoji;
    private ptn mListener;

    private EmojiLoader$EmojiTask(ptn ptnVar, LruCache<String, otn> lruCache, int i, String str) {
        this.mListener = ptnVar;
        this.mCache = lruCache;
        this.mDrawAreaHeight = i;
        this.mEmoji = str;
    }

    private otn createEmojiData(EmojiSpan emojiSpan) {
        Paint paint = new Paint(3);
        paint.setTextAlign(Paint.Align.LEFT);
        Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
        paint.setTextSize(this.mDrawAreaHeight);
        emojiSpan.getSize(paint, null, 0, 0, fontMetricsInt);
        paint.setTextSize((int) ((r6 / Math.abs(fontMetricsInt.descent - fontMetricsInt.ascent)) * r6));
        emojiSpan.getSize(paint, null, 0, 0, fontMetricsInt);
        return new otn(paint, fontMetricsInt, emojiSpan);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        cancel(false);
        this.mListener = null;
    }

    @Override // android.os.AsyncTask
    public otn doInBackground(Void... voidArr) {
        if (isCancelled()) {
            return null;
        }
        otn otnVar = this.mCache.get(this.mEmoji);
        if (otnVar != null) {
            return otnVar;
        }
        CharSequence j = ftn.a().j(this.mEmoji);
        if (!(j instanceof Spannable)) {
            return null;
        }
        EmojiSpan[] emojiSpanArr = (EmojiSpan[]) ((Spannable) j).getSpans(0, this.mEmoji.length(), EmojiSpan.class);
        EmojiSpan emojiSpan = emojiSpanArr.length == 1 ? emojiSpanArr[0] : null;
        if (emojiSpan == null) {
            return null;
        }
        otn createEmojiData = createEmojiData(emojiSpan);
        this.mCache.put(this.mEmoji, createEmojiData);
        return createEmojiData;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(otn otnVar) {
        ptn ptnVar = this.mListener;
        Objects.requireNonNull(ptnVar);
        ptnVar.m(otnVar);
        this.mListener = null;
    }

    public /* synthetic */ EmojiLoader$EmojiTask(ptn ptnVar, LruCache lruCache, int i, String str, int i2) {
        this(ptnVar, lruCache, i, str);
    }
}
