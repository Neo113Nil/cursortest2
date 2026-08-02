package com.yandex.mapkit.road_events;

import com.yandex.runtime.Error;

/* loaded from: classes15.dex */
public interface EntrySession {

    public interface EntryListener {
        void onEntryError(Error error);

        void onEntryReceived(Entry entry);
    }

    void cancel();

    void retry(EntryListener entryListener);
}
