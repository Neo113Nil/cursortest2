package ru.ok.android.externcalls.sdk.events;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import xsna.c5g;

/* compiled from: TypedParticipantEventListener.kt */
/* loaded from: classes9.dex */
public interface TypedParticipantEventListener<T> extends ConversationEventsListener {

    /* compiled from: TypedParticipantEventListener.kt */
    public interface Mapper<T> {
        T map(ConversationParticipant conversationParticipant);
    }

    Mapper<T> getMapper();

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onCallParticipantsNetworkStatusChanged(List<? extends ConversationParticipant> list) {
        List<? extends ConversationParticipant> list2 = list;
        Mapper<T> mapper = getMapper();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map((ConversationParticipant) it.next()));
        }
        onCallParticipantsNetworkChanged(arrayList);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onParticipantsAdded(List<? extends ConversationParticipant> list) {
        List<? extends ConversationParticipant> list2 = list;
        Mapper<T> mapper = getMapper();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map((ConversationParticipant) it.next()));
        }
        onParticipantsWereAdded(arrayList);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onParticipantsChanged(List<? extends ConversationParticipant> list) {
        List<? extends ConversationParticipant> list2 = list;
        Mapper<T> mapper = getMapper();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map((ConversationParticipant) it.next()));
        }
        onParticipantsWereChanged(arrayList);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onParticipantsDeAnonymized(List<? extends ConversationParticipant> list, Map<ParticipantId, ParticipantId> map) {
        List<? extends ConversationParticipant> list2 = list;
        Mapper<T> mapper = getMapper();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map((ConversationParticipant) it.next()));
        }
        onParticipantsWereDeAnonymized(arrayList, map);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onParticipantsRemoved(List<? extends ConversationParticipant> list) {
        List<? extends ConversationParticipant> list2 = list;
        Mapper<T> mapper = getMapper();
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map((ConversationParticipant) it.next()));
        }
        onParticipantsWereRemoved(arrayList);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onParticipantsUpdated(Collection<? extends ConversationParticipant> collection) {
        Collection<? extends ConversationParticipant> collection2 = collection;
        Mapper<T> mapper = getMapper();
        ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(mapper.map((ConversationParticipant) it.next()));
        }
        onParticipantsWereUpdated(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onPinChanged(ConversationParticipant conversationParticipant, boolean z) {
        onPinWasChanged(conversationParticipant != null ? getMapper().map(conversationParticipant) : null, z);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    default void onRolesChanged(ConversationParticipant conversationParticipant) {
        onRolesWereChanged(getMapper().map(conversationParticipant));
    }

    default void onCallParticipantsNetworkChanged(Collection<? extends T> collection) {
    }

    default void onParticipantsWereAdded(Collection<? extends T> collection) {
    }

    default void onParticipantsWereChanged(Collection<? extends T> collection) {
    }

    default void onParticipantsWereRemoved(Collection<? extends T> collection) {
    }

    default void onParticipantsWereUpdated(Collection<? extends T> collection) {
    }

    default void onRolesWereChanged(T t) {
    }

    default void onParticipantsWereDeAnonymized(Collection<? extends T> collection, Map<ParticipantId, ParticipantId> map) {
    }

    default void onPinWasChanged(T t, boolean z) {
    }
}
