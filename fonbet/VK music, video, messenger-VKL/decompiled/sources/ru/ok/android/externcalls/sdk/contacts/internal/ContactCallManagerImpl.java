package ru.ok.android.externcalls.sdk.contacts.internal;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.listener.ContactCallListener;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.webrtc.listeners.CallContactCallListener;
import ru.ok.android.webrtc.participant.CallParticipant;
import xsna.epx;

/* compiled from: ContactCallManagerImpl.kt */
/* loaded from: classes9.dex */
public final class ContactCallManagerImpl implements ContactCallManager, CallContactCallListener {
    private boolean iAmAnonymous;
    private final boolean iWasInitiallyAnonymous;
    private final CopyOnWriteArraySet<ContactCallListener> listeners = new CopyOnWriteArraySet<>();
    private final ParticipantStore participantsStore;

    public ContactCallManagerImpl(ParticipantStore participantStore, boolean z) {
        this.participantsStore = participantStore;
        this.iWasInitiallyAnonymous = z;
        this.iAmAnonymous = z;
    }

    private final void notifyContactCallStateChanged() {
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((ContactCallListener) it.next()).onContactCallMyAnonChanged();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public void addContactCallListener(ContactCallListener contactCallListener) {
        this.listeners.add(contactCallListener);
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public boolean getIAmAnonymous() {
        return this.iAmAnonymous;
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public boolean getIWasInitiallyAnonymous() {
        return this.iWasInitiallyAnonymous;
    }

    @Override // ru.ok.android.webrtc.listeners.CallContactCallListener
    public void onDecorativeParticipantIdChanged(CallContactCallListener.DecorativeParticipantIdChanged decorativeParticipantIdChanged) {
        CallParticipant callParticipant;
        ConversationParticipant me2 = this.participantsStore.getMe();
        if (me2 == null || (callParticipant = me2.getCallParticipant()) == null || !getIAmAnonymous() || !epx.f(decorativeParticipantIdChanged.getOriginalParticipantId(), callParticipant.getParticipantId())) {
            return;
        }
        this.iAmAnonymous = false;
        notifyContactCallStateChanged();
    }

    @Override // ru.ok.android.externcalls.sdk.contacts.ContactCallManager
    public void removeContactCallListener(ContactCallListener contactCallListener) {
        this.listeners.remove(contactCallListener);
    }
}
